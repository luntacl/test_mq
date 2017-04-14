package com.ulic.core.batch.executor;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

import com.lmax.disruptor.BlockingWaitStrategy;
import com.lmax.disruptor.EventFactory;
import com.lmax.disruptor.EventTranslatorOneArg;
import com.lmax.disruptor.RingBuffer;
import com.lmax.disruptor.WorkHandler;
import com.lmax.disruptor.dsl.Disruptor;
import com.lmax.disruptor.dsl.ProducerType;
import com.lmax.disruptor.util.DaemonThreadFactory;
import com.ulic.core.batch.disruptor.Slf4jExceptionHandler;


/**
 * 使用disruptor实现的线程池,实现了ExecutorService接口，可以使用future
 */
public class DisruptorExecutor extends AbstractExecutorService implements EventFactory<RunnableEvent>,
		EventTranslatorOneArg<RunnableEvent, Runnable>, WorkHandler<RunnableEvent>, ExecutorService {

	private Disruptor<RunnableEvent> disruptor;

	private RingBuffer<RunnableEvent> ringBuffer;
	/**
	 * ringBuffer的默认长度
	 */
	private int bufferSize = 8192;
	private int paralleSize = 4;
	private AtomicBoolean running = new AtomicBoolean(false);

	public DisruptorExecutor() {
		start();
	}

	public DisruptorExecutor(int bufferSize, int paralleSize) {
		start(bufferSize, paralleSize);
	}

	public void start() {
		start(bufferSize, paralleSize);
	}

	@SuppressWarnings("unchecked")
	public void start(int bufferSize, int paralleSize) {
		if (!running.compareAndSet(false, true))
			return;
		disruptor = new Disruptor<>(this, bufferSize, DaemonThreadFactory.INSTANCE, ProducerType.MULTI,
				new BlockingWaitStrategy());
		disruptor.setDefaultExceptionHandler(new Slf4jExceptionHandler<RunnableEvent>());
		WorkHandler<RunnableEvent>[] works = new WorkHandler[paralleSize];
		for (int i = 0; i < paralleSize; i++) {
			works[i] = this;
		}
		disruptor.handleEventsWithWorkerPool(works);
		ringBuffer = disruptor.start();
	}

	@Override
	public void shutdown() {
		disruptor.shutdown();
		running.set(false);
	}

	@Override
	public List<Runnable> shutdownNow() {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isShutdown() {
		return !running.get();
	}

	@Override
	public boolean isTerminated() {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
		throw new UnsupportedOperationException();
	}

	@Override
	public void execute(Runnable command) {
		ringBuffer.publishEvent(this, command);
	}

	@Override
	public RunnableEvent newInstance() {
		return new RunnableEvent();
	}

	@Override
	public void translateTo(RunnableEvent arg0, long arg1, Runnable arg2) {
		arg0.setValue(arg2);

	}

	@Override
	public void onEvent(RunnableEvent var1) throws Exception {
		var1.getValue().run();
	}

	@Override
	protected void finalize() {
		shutdown();
	}
}
