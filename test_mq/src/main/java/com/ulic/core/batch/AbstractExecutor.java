package com.ulic.core.batch;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import com.ulic.common.util.ReflectionUtil;
import com.ulic.core.batch.manager.ParamControllable;
import com.ulic.core.batch.manager.ParamValueBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 执行器的基类
 */
public abstract class AbstractExecutor implements TaskService
{

	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * 当前执行器是否已经执行
	 */
	@ParamControllable(desc = "当前任务执行状态，true：运行，false：停止", writable = false)
	protected boolean running;

	/**
	 * 获取可控制的参数值
	 * 
	 * @return
	 */
	public List<ParamValueBean> getParamValues()
	{
		List<ParamValueBean> result = new ArrayList<ParamValueBean>();

		Field[] declaredFields = ReflectionUtil.getDeclaredFields(this.getClass());
		for (Field field : declaredFields)
		{
			ParamControllable annotation = field.getAnnotation(ParamControllable.class);

			if (annotation != null)
			{
				ParamValueBean bean = new ParamValueBean();
				bean.setDesc(annotation.desc());
				bean.setName(field.getName());
				bean.setValue(ReflectionUtil.getFieldValue(this, field));
				bean.setWritable(annotation.writable());
				result.add(bean);
			}

		}
		return result;
	}

	public boolean isRunning()
	{
		return running;
	}

	public void stop()
	{
		running = false;
	}

	/**
	 * 返回执行器（或者任务、批处理等）的名字
	 * 
	 * @return
	 */
	public String getName()
	{
		return this.getClass().getSimpleName();
	}

}
