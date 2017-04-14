package com.ulic.core.config.service;

import com.ulic.core.config.bean.ConfigBusiness;

public interface ConfigBusinessService {

	/**
	 * 查询业务配置记录
	 * @param businessType
	 * @return
	 */
	public ConfigBusiness findByPrimaryKey(String businessType);
	
	/**
	 * 保存业务配置记录
	 * @param configBusiness
	 * @return
	 */
	public boolean saveConfigBusiness(ConfigBusiness configBusiness);

	/**
	 * 更新业务配置记录
	 * @param configBusiness
	 * @return
	 */
	public boolean updateConfigBusiness(ConfigBusiness configBusiness);
	
	/**
	 * 删除业务配置记录
	 * @param businessType
	 * @return
	 */
	public boolean deleteByPrimaryKey(String businessType);
}
