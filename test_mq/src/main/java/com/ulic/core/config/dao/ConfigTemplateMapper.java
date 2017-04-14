package com.ulic.core.config.dao;

import com.ulic.core.config.bean.ConfigTemplate;

public interface ConfigTemplateMapper {
    
	int deleteByPrimaryKey(String templateId);

    int insert(ConfigTemplate record);

    int insertSelective(ConfigTemplate record);

    ConfigTemplate selectByPrimaryKey(String templateId);

    int updateByPrimaryKeySelective(ConfigTemplate record);

    int updateByPrimaryKey(ConfigTemplate record);
    
}