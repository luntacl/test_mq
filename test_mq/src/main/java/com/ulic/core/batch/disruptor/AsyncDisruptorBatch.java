package com.ulic.core.batch.disruptor;

import java.util.Collection;
import java.util.concurrent.TimeUnit;

import com.lmax.disruptor.BlockingWaitStrategy;
import com.lmax.disruptor.EventFactory;
import com.lmax.disruptor.EventTranslatorOneArg;
import com.lmax.disruptor.RingBuffer;
import com.lmax.disruptor.TimeoutException;
import com.lmax.disruptor.WorkHandler;
import com.lmax.disruptor.dsl.Disruptor;
import com.lmax.disruptor.dsl.EventHandlerGroup;
import com.lmax.disruptor.dsl.ProducerType;
import com.lmax.disruptor.util.DaemonThreadFactory;

/**
 * 使用disruptor进行异步处理的代码 使用后台线程进行异步处理，队列已满的时候采用blocking策略,发生异常时使用slf4j记录日志
 * 添加了任务链，后一批批消费者会等前一批消费者处理完毕后进行处理
 */
public abstract class AsyncDisruptorBatch<T, T2> implements EventFactory<T>,
		EventTranslatorOneArg<T, T2>
{

	/**
	 * ringBuffer的默认长度
	 */
	private int bufferSize = 8192;

	/**
	 * 第一批消费者的数量
	 */
	private int firstParalleSize = 4;
	/**
	 * 第二批消费者的数量，不用时候设为0，提高性能
	 */
	private int secondParalleSize = 0;
	/**
	 * 第三批消费者的数量，不用时候设为0，提高性能
	 */
	private int thirdParalleSize = 0;

	public AsyncDisruptorBatch()
	{
		start();
	}

	public AsyncDisruptorBatch(int bufferSize)
	{
		this.bufferSize = bufferSize;
		start();
	}

	public AsyncDisruptorBatch(int bufferSize, int firstParalleSize)
	{
		this.bufferSize = bufferSize;
		this.firstParalleSize = firstParalleSize;
		start();
	}

	public AsyncDisruptorBatch(int bufferSize, int firstParalleSize,
			int secondParalleSize, int thirdParalleSize)
	{
		this.bufferSize = bufferSize;
		this.firstParalleSize = firstParalleSize;
		this.secondParalleSize = secondParalleSize;
		this.thirdParalleSize = thirdParalleSize;
		start();
	}

	private Disruptor<T> disruptor;

	private RingBuffer<T> ringBuffer = null;

	public RingBuffer<T> getRingBuffer()
	{
		return ringBuffer;
	}

	/**
	 * 事件工厂的实现
	 */
	public abstract T newInstance();

	/**
	 * 第一批消费者的任务
	 * 
	 * @throws Exception
	 */
	public abstract void onFirstEvent(T event) throws Exception;

	/**
	 * 第二批消费者的任务
	 * 
	 * @throws Exception
	 */
	public void onSecondEvent(T event) throws Exception{};

	/**
	 * 第三批消费者的任务
	 * 
	 * @throws Exception
	 */
	public void onThirdEvent(T event) throws Exception{}

	/**
	 * 生产者提交的数据与消费者的需要的数据之间的关系
	 */
	public abstract void translateTo(T event, long sequence, T2 value);

	/**
	 * @return 提交成功返回true，因阻塞未提交成功返回false
	 */
	public boolean add(T2 value)
	{
		return ringBuffer.tryPublishEvent(this, value);
	}

	/**
	 * 批量提交，values的长度不能超过bufferSize
	 * 
	 * @return 提交成功返回true，因阻塞未提交成功返回false
	 */
	public boolean add(T2[] values)
	{
		return ringBuffer.tryPublishEvents(this, values);
	}

	/**
	 * 批量提交，list的长度不能超过bufferSize
	 * 
	 * @return 提交成功返回true，因阻塞未提交成功返回false
	 */
	public boolean add(Collection<T2> values)
	{
		@SuppressWarnings("unchecked")
		T2[] val = (T2[]) values.toArray();
		return add(val);
	}

	public void start()
	{
		disruptor = new Disruptor<T>(this, bufferSize,
				DaemonThreadFactory.INSTANCE, ProducerType.MULTI,
				new BlockingWaitStrategy());

		disruptor.setDefaultExceptionHandler(new Slf4jExceptionHandler<T>());

		allocatingTask();

		ringBuffer = disruptor.start();
	}

	private class firstWorkTask implements WorkHandler<T>
	{
		/**
		 * {@inheritDoc}
		 */
		@Override
		public void onEvent(T event) throws Exception
		{
			onFirstEvent(event);
		}

	}

	private class SecondWorkTask implements WorkHandler<T>
	{
		/**
		 * {@inheritDoc}
		 */
		@Override
		public void onEvent(T event) throws Exception
		{
			onSecondEvent(event);

		}
	}

	private class ThirdWorkTask implements WorkHandler<T>
	{
		/**
		 * {@inheritDoc}
		 */
		@Override
		public void onEvent(T event) throws Exception
		{
			onThirdEvent(event);
		}
	}

	/**
	 * 指定任务策略，默认只有三个任务链，如果有更复杂的任务链请覆盖此方法
	 * 
	 * @time 2016年3月23日 上午10:35:29
	 */
	@SuppressWarnings("unchecked")
	public void allocatingTask()
	{
		if(firstParalleSize<=0) throw new RuntimeException("第一批消费者数量不能小于0！");
		WorkHandler<T>[] firstWorks = new WorkHandler[firstParalleSize];
		for (int i = 0; i < firstParalleSize; i++)
		{
			firstWorks[i] = new firstWorkTask();
		}
		EventHandlerGroup<T> workerPool = disruptor.handleEventsWithWorkerPool(firstWorks);
		if (secondParalleSize > 0)
		{
			WorkHandler<T>[] secondWorks = new WorkHandler[secondParalleSize];
			for (int i = 0; i < secondParalleSize; i++)
			{
				secondWorks[i] = new SecondWorkTask();
			}
			workerPool=workerPool.thenHandleEventsWithWorkerPool(secondWorks);
		}
		if (thirdParalleSize > 0)
		{
			WorkHandler<T>[] thirdWorks = new WorkHandler[thirdParalleSize];
			for (int i = 0; i < thirdParalleSize; i++)
			{
				thirdWorks[i] = new ThirdWorkTask();
			}
			workerPool.thenHandleEventsWithWorkerPool(thirdWorks);
		}
	}

	/**
	 * 关闭disruptor，会一直等所有任务执行完成后关闭
	 * 
	 * @time 2016年3月23日 上午11:11:33
	 */
	public void stop()
	{
		disruptor.shutdown();
	}

	/**
	 * 关闭disruptor，当超过指定时间后会抛出TimeoutException异常,单位毫秒
	 * 
	 * @time 2016年3月23日 上午11:13:27
	 * @param timeout
	 * @throws TimeoutException
	 */
	public void stop(final long timeout) throws TimeoutException
	{
		disruptor.shutdown(timeout, TimeUnit.MILLISECONDS);
	}
}