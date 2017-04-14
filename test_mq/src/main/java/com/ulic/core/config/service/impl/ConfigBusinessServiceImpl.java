package com.ulic.core.config.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ulic.core.config.bean.ConfigBusiness;
import com.ulic.core.config.dao.ConfigBusinessMapper;
import com.ulic.core.config.service.ConfigBusinessService;

@Service
public class ConfigBusinessServiceImpl implements ConfigBusinessService {

	private static final Logger logger = LoggerFactory.getLogger(ConfigBusinessServiceImpl.class);
	@Autowired
	private ConfigBusinessMapper configBusinessMapper;
	
	/**
	 * 查询业务配置记录
	 * @param businessType
	 * @return
	 */
	@Override
	public ConfigBusiness findByPrimaryKey(String businessType) {
		try {
			return configBusinessMapper.selectByPrimaryKey(businessType);
		} catch (Exception e) {
			logger.error("====ConfigBusinessService.findByPrimaryKey Exception====",e);
			return null;
		}
	}

	/**
	 * 保存业务配置记录
	 * @param configBusiness
	 * @return
	 */
	@Override
	public boolean saveConfigBusiness(ConfigBusiness configBusiness) {
		try {
			return configBusinessMapper.insertSelective(configBusiness) == 1;
		} catch (Exception e) {
			logger.error("====ConfigBusinessService.saveConfigBusiness Exception====",e);
			return false;
		}
	}

	/**
	 * 更新业务配置记录
	 * @param configBusiness
	 * @return
	 */
	@Override
	public boolean updateConfigBusiness(ConfigBusiness configBusiness) {
		try {
			return configBusinessMapper.updateByPrimaryKeySelective(configBusiness) == 1;
		} catch (Exception e) {
			logger.error("====ConfigBusinessService.updateConfigBusiness Exception====",e);
			return false;
		}
	}

	/**
	 * 删除业务配置记录
	 * @param businessType
	 * @return
	 */
	@Override
	public boolean deleteByPrimaryKey(String businessType) {
		try {
			return configBusinessMapper.deleteByPrimaryKey(businessType) == 1;
		} catch (Exception e) {
			logger.error("====ConfigBusinessService.deleteByPrimaryKey Exception====",e);
			return false;
		}
	}

}
