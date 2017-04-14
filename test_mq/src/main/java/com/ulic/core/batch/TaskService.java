
package com.ulic.core.batch;

public interface TaskService
{
	/**
	 * 停止任务
	 */
	void stop();

	/**
	 * 启动任务
	 */
	void start();

	/**
	 * 判断任务是否正在运行
	 * 
	 * @return 正在运行返回 true，否则返回false
	 */
	boolean isRunning();

}
