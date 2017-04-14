/** 
 * 类说明 
*/ 
package com.ulic.core.batch.disruptor.bean;

/** 
 * @Description 带有处理结果的事件发布器
 */
public class ValueAndResultEvent<T,V>
{
	private T value;
	private V result;
	public T getValue()
	{
		return value;
	}
	public void setValue(T value)
	{
		this.value = value;
	}
	public V getResult()
	{
		return result;
	}
	public void setResult(V result)
	{
		this.result = result;
	}
	
}
