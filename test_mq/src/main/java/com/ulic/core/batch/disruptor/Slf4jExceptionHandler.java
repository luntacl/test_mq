package com.ulic.core.batch.disruptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.lmax.disruptor.ExceptionHandler;

public class Slf4jExceptionHandler<T>  implements ExceptionHandler<T>
{
	private static final Logger LOGGER = LoggerFactory.getLogger(Slf4jExceptionHandler.class.getName());
	
	private final Logger logger;
	
	public Slf4jExceptionHandler()
	{
		this.logger=LOGGER;
	}

	@Override
	public void handleEventException(Throwable ex, long sequence, T event)
	{
		logger.error("Exception processing: " + sequence + " " + event,ex);
	}

	@Override
	public void handleOnStartException(Throwable ex)
	{
		logger.error("Exception during onStart()",ex);
	}

	@Override
	public void handleOnShutdownException(Throwable ex)
	{
		logger.error("Exception during onShutdown()",ex);
	}

}
