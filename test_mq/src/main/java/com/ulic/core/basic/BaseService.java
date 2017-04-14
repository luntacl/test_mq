package com.ulic.core.basic;

import java.util.List;

import com.ulic.common.util.ReflectionUtil;
import com.ulic.core.batch.executor.DisruptorProxy;
import org.springframework.beans.factory.annotation.Autowired;

import insure.platform.mybatis.mapper.common.Mapper;
import insure.platform.mybatis.mapper.entity.Example;

/**
 * service公共抽象类，提供了对数据库基本的方法封装 加入了异步处理的方法,对于有返回值的方法，返回一个代理对象
 * 
 * @see
 * @param <T>
 *            数据库对应的javabean
 */
public abstract class BaseService<T> {
	@Autowired
	private Mapper<T> mapper;

	public List<T> select(T record) {
		return mapper.select(record);
	}
	
	public List<T> selectAsync(T record) {
		return mapper.select(record);
	}

	public List<T> selectAll() {
		return mapper.selectAll();
	}

	@DisruptorProxy
	public List<T> selectAllAsync() {
		return mapper.selectAll();
	}

	public T selectByPrimaryKey(Object key) {
		return mapper.selectByPrimaryKey(key);
	}

	@DisruptorProxy
	public T selectByPrimaryKeyAsync(Object key) {
		return mapper.selectByPrimaryKey(key);
	}

	public T selectOne(T record) {
		return mapper.selectOne(record);
	}

	@DisruptorProxy
	public T selectOneAsync(T record) {
		return mapper.selectOne(record);
	}

	public int selectCount(T record) {
		return mapper.selectCount(record);
	}

	public List<T> selectByExample(Object example) {
		return mapper.selectByExample(example);
	}

	@DisruptorProxy
	public List<T> selectByExampleAsync(Object example) {
		return mapper.selectByExample(example);
	}

	public int updateByPrimaryKey(T record) {
		return mapper.updateByPrimaryKey(record);
	}

	@DisruptorProxy
	public void updateByPrimaryKeyAsync(T record) {
		mapper.updateByPrimaryKey(record);
	}

	public int updateByPrimaryKeySelective(T record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@DisruptorProxy
	public void updateByPrimaryKeySelectiveAsync(T record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	public int updateByExample(T record, Object example) {
		return mapper.updateByExample(record, example);
	}

	@DisruptorProxy
	public void updateByExampleAsync(T record, Object example) {
		mapper.updateByExample(record, example);
	}

	public int updateByExampleSelective(T record, Object example) {
		return mapper.updateByExampleSelective(record, example);
	}

	@DisruptorProxy
	public void updateByExampleSelectiveAsync(T record, Object example) {
		mapper.updateByExampleSelective(record, example);
	}

	public int insert(T record) {
		return mapper.insert(record);
	}

	@DisruptorProxy
	public void insertAsync(T record) {
		mapper.insert(record);
	}

	public int insertSelective(T record) {
		return mapper.insertSelective(record);
	}

	@DisruptorProxy
	public void insertSelectiveAsync(T record) {
		mapper.insertSelective(record);
	}

	public int delete(T record) {
		return mapper.delete(record);
	}

	@DisruptorProxy
	public void deleteAsync(T record) {
		mapper.delete(record);
	}

	public int deleteByPrimaryKey(Object key) {
		return mapper.deleteByPrimaryKey(key);
	}

	public int deleteByExample(Object example) {
		return mapper.deleteByExample(example);
	}

	public List<T> filter(String... selectProperties) {
		Class<T> beanClass = ReflectionUtil.getSuperClassGenricType(getClass());
		Example example = new Example(beanClass);
		example.selectProperties(selectProperties);
		return selectByExample(example);
	}

	@DisruptorProxy
	public List<T> filterAsync(String... selectProperties) {
		return filter(selectProperties);
	}
}