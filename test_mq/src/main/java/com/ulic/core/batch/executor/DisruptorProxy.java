
package com.ulic.core.batch.executor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.concurrent.TimeUnit;

/**
 * 加入该注解，将方法异步到disruptor中执行
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DisruptorProxy {
	/**
	 * 线程池数量
	 */
	int bufferSize() default 8192;

	/**
	 * 并行个数
	 */
	int paralleSize() default 4;
	
	/**
	 * 超时时间，返回一个对象的时候有用，小于等于0为不超时
	 */
	long timeout() default 0;
	
	/**
	 * 超时时间单位，默认为毫秒
	 */
	TimeUnit timeunit() default TimeUnit.MICROSECONDS;
}
