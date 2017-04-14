package com.ulic.core.batch.executor;

import java.lang.reflect.Method;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * 返回结果代理拦截器
 */
public class DisruptorResultInterceptor implements MethodInterceptor {

	private Future<Object> future;
	private long timeout;
	private TimeUnit timeunit;

	public DisruptorResultInterceptor(Future<Object> future, long timeout,TimeUnit timeunit) {
		this.future = future;
		this.timeout = timeout;
		this.timeunit=timeunit;
	}

	public DisruptorResultInterceptor(Future<Object> future) {
		this.future = future;
		this.timeout = 0;
		this.timeunit=TimeUnit.MILLISECONDS;
	}

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		obj = getResultFromFuture();
		if (obj != null){
			return methodProxy.invoke(obj, args);
		}
		return null;
	}

	private Object getResultFromFuture() throws InterruptedException, ExecutionException, TimeoutException {
		if (timeout <= 0) {
			return future.get();
		} else {
			return future.get(timeout, timeunit);
		}
	}

}
