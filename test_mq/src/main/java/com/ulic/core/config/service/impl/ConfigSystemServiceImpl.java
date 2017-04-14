package com.ulic.core.config.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ulic.core.config.bean.ConfigSystem;
import com.ulic.core.config.dao.ConfigSystemMapper;
import com.ulic.core.config.service.ConfigSystemService;

@Service
public class ConfigSystemServiceImpl implements ConfigSystemService
{
	private static final Logger logger = LoggerFactory.getLogger(ConfigSystemServiceImpl.class);
	@Autowired
	private ConfigSystemMapper configSystemMapper;

	public String getValueByKey(final String section, final String keyName)
	{
		return getValueByKey("sys", section, keyName);
	}

	//	@Cacheable(value="ConfigSystemService",key="#configSystemCategory+'|'+#section+'|'+#keyName")
	public String getValueByKey(final String configSystemCategory, final String section, final String keyName)
	{
		ConfigSystem valueByKey = configSystemMapper.getValueByKey(configSystemCategory,section,keyName);
		if(valueByKey == null) return "undefined";
		return valueByKey.getConfigSystemValue();
	}
	@Override
	public ConfigSystem findByPrimaryKey(Long configSystemId) {
		return null;
	}

	@Override
	public boolean saveConfigSystem(ConfigSystem configSystem) {
		return false;
	}

	@Override
	public boolean updateConfigSystem(ConfigSystem configSystem) {
		return false;
	}

	@Override
	public boolean deleteByPrimaryKey(Long configSystemId) {
		return false;
	}


}
