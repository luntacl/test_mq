package com.ulic.core.config.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.ulic.core.config.bean.ConfigBusiness;


public interface ConfigBusinessMapper {

	int deleteByPrimaryKey(String businessType);

	int insert(ConfigBusiness record);

	int insertSelective(ConfigBusiness record);

	ConfigBusiness selectByPrimaryKey(String businessType);

	int updateByPrimaryKeySelective(ConfigBusiness record);

	int updateByPrimaryKey(ConfigBusiness record);

	List<ConfigBusiness> selectSelective(Map<String, Object> params);
	
	List<Map<String,String>> selectAll();
	
	List<Map<String,String>> selectByTypeList(@Param("typeList") List<String> typeList);
	
	List<ConfigBusiness> selectByInfo(Map<String, Object> params);
	
	int countByInfo(Map<String, Object> params);
}