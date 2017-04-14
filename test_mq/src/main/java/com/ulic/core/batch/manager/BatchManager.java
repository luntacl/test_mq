package com.ulic.core.batch.manager;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import com.ulic.core.batch.AsyncBatchExecutor;
import com.ulic.core.batch.SyncBatchExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class BatchManager
{

	private static Logger logger = LoggerFactory.getLogger(BatchManager.class);

	private static class SingletonHelper
	{
		private static final BatchManager INSTANCE = new BatchManager();
	}

	public static BatchManager getInstance()
	{
		return SingletonHelper.INSTANCE;
	}

	private BatchManager()
	{
		logger.debug("BatchManager start");
	}

	// 包含所有批处理
	private final ConcurrentHashMap<String, SyncBatchExecutor> batches = new ConcurrentHashMap<String, SyncBatchExecutor>();
	private final ConcurrentHashMap<String, AsyncBatchExecutor> asyncBatches = new ConcurrentHashMap<String, AsyncBatchExecutor>();

	// 注册批处理
	public void registerSyncBatch(SyncBatchExecutor batch)
	{
		if (batch != null && !batches.containsKey(batch.getName()))
		{
			logger.debug(batch.getName() + " registing");
			batches.put(batch.getName(), batch);
		}
	}

	// 注销批处理
	public void unRegisterSyncBatch(String batchName)
	{
		batches.remove(batchName);
	}

	// 注销批处理
	public void unRegisterSyncBatch(SyncBatchExecutor batch)
	{
		if (batch != null)
		{
			logger.debug(batch.getName());
			batches.remove(batch.getName());
		}
	}

	// 注销批处理
	public void unRegisterAsyncBatch(AsyncBatchExecutor batch)
	{
		if (batch != null)
		{
			logger.debug(batch.getName());
			asyncBatches.remove(batch.getName());
		}
	}

	// 获取特定的批处理
	public SyncBatchExecutor getSyncBatch(String batchName)
	{
		return batches.get(batchName);
	}

	// 获取特定的批处理
	public AsyncBatchExecutor getAsyncBatch(String batchName)
	{
		return asyncBatches.get(batchName);
	}

	// 获取所有批处理的名称
	public Set<String> getSyncBatchNames()
	{
		return batches.keySet();
	}

	/*
	 * // 获取所有批处理的名称 public Set<String> getBatchNames() { return
	 * batches.keySet(); }
	 */

	// 获取所有的批处理实例
	public Collection<SyncBatchExecutor> getBatchList()
	{
		return batches.values();
	}

	// 使用缺省方式启动所有批处理
	public void startAllBatch()
	{
		for (AsyncBatchExecutor batch : asyncBatches.values())
		{
			logger.info("AsyncBatch[" + batch.getName() + "] starting");
			batch.start();
		}

		for (SyncBatchExecutor batchItem : batches.values())
		{
			logger.info("SyncBatch[" + batchItem.getName() + "] starting");
			try
			{
				batchItem.start();
			} catch (Exception e)
			{
				e.printStackTrace();
			}
		}

	}

	// 关闭所有批处理
	public void stopAllBatch()
	{
		for (AsyncBatchExecutor batch : asyncBatches.values())
		{
			batch.stop();
		}

		for (SyncBatchExecutor batchItem : batches.values())
		{
			batchItem.stop();
		}
	}

	// // 批量加载自动启动的批类。类之间使用;分割
	public void loadSyncBatch(String batchList)
	{
		String[] batchNameArray = batchList.replaceAll("\n", "").replace("\r", "").split(";");
		// logger.debug(batchNameArray.toString());
		loadSyncBatch(batchNameArray);
	}

	public void loadAsyncBatch(String initParameter)
	{
		String[] batchNameArray = initParameter.replaceAll("\n", "").replace("\r", "").split(";");
		logger.debug("loadAsyncBatch=====" + initParameter);
		loadAsyncBatch(batchNameArray);
	}

	public void loadAsyncBatch(String[] batchList)
	{
		for (String className : batchList)
		{
			String clzName = className.trim();
			if (clzName.isEmpty())
			{
				continue;
			}
			try
			{
				Class cls = Class.forName(clzName);

				Method m = cls.getDeclaredMethod("getInstance", null);
				AsyncBatchExecutor batch = (AsyncBatchExecutor) m.invoke(cls, null);
				BatchManager.getInstance().registerAsyncBatch(batch);
			} catch (ClassNotFoundException e)
			{
				e.printStackTrace();
			} catch (IllegalAccessException e)
			{
				e.printStackTrace();
			} catch (NoSuchMethodException e)
			{
				e.printStackTrace();
			} catch (SecurityException e)
			{
				e.printStackTrace();
			} catch (IllegalArgumentException e)
			{
				e.printStackTrace();
			} catch (InvocationTargetException e)
			{
				e.printStackTrace();
			}
		}
	}

	private void registerAsyncBatch(AsyncBatchExecutor batch)
	{
		asyncBatches.put(batch.getClass().getSimpleName(), batch);
	}

	// 批量加载自动启动的批
	public void loadSyncBatch(String[] batchList)
	{
		for (String className : batchList)
		{
			String clzName = className.trim();
			if (clzName.isEmpty())
			{
				continue;
			}
			Class cls;
			try
			{
				cls = Class.forName(clzName);

				Method m = cls.getDeclaredMethod("getInstance", null);
				SyncBatchExecutor batch = (SyncBatchExecutor) m.invoke(cls, null);
				BatchManager.getInstance().registerSyncBatch(batch);
			} catch (ClassNotFoundException e)
			{
				e.printStackTrace();
			} catch (IllegalAccessException e)
			{
				e.printStackTrace();
			} catch (NoSuchMethodException e)
			{
				e.printStackTrace();
			} catch (SecurityException e)
			{
				e.printStackTrace();
			} catch (IllegalArgumentException e)
			{
				e.printStackTrace();
			} catch (InvocationTargetException e)
			{
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args)
	{
		String names = "batchsys.sample.SampleBatchSys;";

		BatchManager.getInstance().loadSyncBatch(names);
		String anames = "batchsys.sample.AsyncLoginBatch;";

		BatchManager.getInstance().loadAsyncBatch(anames);
		BatchManager.getInstance().startAllBatch();
	}

}
