package com.ulic.core.config.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.ulic.core.config.bean.ConfigSystem;
public interface ConfigSystemMapper 
{
	
	int deleteByPrimaryKey(Long configSystemId);

	
	int insert(ConfigSystem record);

	
	int insertSelective(ConfigSystem record);

	
	ConfigSystem selectByPrimaryKey(Long configSystemId);

	
	int updateByPrimaryKeySelective(ConfigSystem record);

	
	int updateByPrimaryKey(ConfigSystem record);

	ConfigSystem getValueByKey(@Param("configSystemCategory") String configSystemCategory, @Param("section") String section, @Param("keyName") String keyName);
	
	List<ConfigSystem> selectByInfo(Map<String, Object> params);
	
	int countByInfo(Map<String, Object> params);
}