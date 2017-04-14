package com.ulic.core.batch.disruptor.bean;

public interface EventPerformer<V>
{
	void handle(V value);
}
