/**
 * 
 */
package com.ulic.core.batch.manager;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 该注解加在对象的属性上，用来标示该属性是否可以在系统运行当中被读取以及被修改
 */
@Target(
{ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ParamControllable
{

	boolean readable() default true;

	boolean writable() default true;

	String desc() default "";
}
