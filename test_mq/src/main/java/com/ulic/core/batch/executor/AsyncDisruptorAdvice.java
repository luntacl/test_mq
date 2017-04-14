package com.ulic.core.batch.executor;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.aop.support.AopUtils;
import org.springframework.cglib.core.ReflectUtils;
import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.core.BridgeMethodResolver;
import org.springframework.stereotype.Service;
import org.springframework.util.ClassUtils;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;

@Service
@Aspect
public class AsyncDisruptorAdvice {
	private final Map<Method, ExecutorService> executors = new ConcurrentHashMap<>(16);
	private final Map<String, Class<?>> proxys = new ConcurrentHashMap<>(16);

	@Around(value = "@annotation(disruptorProxy)")
	public Object runWithDisruptor(final ProceedingJoinPoint joinPoint, DisruptorProxy disruptorProxy)
			throws Throwable {
		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
		Class<?> targetClass = (joinPoint.getThis() != null ? AopUtils.getTargetClass(joinPoint.getThis()) : null);
		Method specificMethod = ClassUtils.getMostSpecificMethod(methodSignature.getMethod(), targetClass);
		final Method userDeclaredMethod = BridgeMethodResolver.findBridgedMethod(specificMethod);
		ExecutorService executor = getExecutors(userDeclaredMethod, disruptorProxy);
		Callable<Object> task = new Callable<Object>() {
			@Override
			public Object call() throws Exception {
				try {
					Object result = joinPoint.proceed();
					if (result instanceof Future) {
						return ((Future<?>) result).get();
					} else {
						return result;
					}
				} catch (Exception e) {
					throw e;
				} catch (Throwable e) {
					e.printStackTrace();
				}
				return null;
			}
		};
		return doSubmit(task, executor, userDeclaredMethod.getReturnType(), disruptorProxy);
	}

	private ExecutorService getExecutors(Method method, DisruptorProxy disruptorProxy) {
		ExecutorService executorService = executors.get(method);
		if (executorService == null) {
			int bufferSize = disruptorProxy.bufferSize();
			int paralleSize = disruptorProxy.paralleSize();
			executorService = new DisruptorExecutor(bufferSize, paralleSize);
			this.executors.put(method, executorService);
		}
		return executorService;

	}

	protected Object doSubmit(Callable<Object> task, ExecutorService executor, Class<?> returnType,
			DisruptorProxy disruptorProxy) throws InterruptedException, ExecutionException {
		if (ListenableFuture.class.isAssignableFrom(returnType)) {
			return MoreExecutors.listeningDecorator(executor).submit(task);
		} else if (Future.class.isAssignableFrom(returnType)) {
			return executor.submit(task);
		}else if(Void.TYPE.isAssignableFrom(returnType)) {
			executor.submit(task);
			return null;
		}else if ((Modifier.isPublic(returnType.getModifiers()) && !Modifier.isFinal(returnType.getModifiers())
						&& !(returnType.isPrimitive() || returnType.isArray()) && returnType != Object.class)) {
			ListenableFuture<Object> future = MoreExecutors.listeningDecorator(executor).submit(task);
			Class<?> proxyClass = proxys.get(returnType.getName());
			if (proxyClass == null) {
				proxyClass = createProxyClass(returnType);
				proxys.put(returnType.getName(), proxyClass);
			}
			Enhancer.registerCallbacks(proxyClass, new Callback[] {
					new DisruptorResultInterceptor(future, disruptorProxy.timeout(), disruptorProxy.timeunit()) });
			Object proxyObject = null;
			try {
				proxyObject = ReflectUtils.newInstance(proxyClass);
			} finally {
				Enhancer.registerStaticCallbacks(proxyClass, null);
			}
			return proxyObject;
		} else {
			return executor.submit(task).get();

		}
	}

	/**
	 * @param returnType
	 * @return
	 */
	private Class<?> createProxyClass(Class<?> returnType) {
		Class<?> proxyClass;
		Enhancer enhancer = new Enhancer();
		if (returnType.isInterface()) {
			enhancer.setInterfaces(new Class[] { returnType });
		} else {
			enhancer.setSuperclass(returnType);
		}
		enhancer.setCallbackType(DisruptorResultInterceptor.class);
		proxyClass = enhancer.createClass();
		return proxyClass;
	}

}
