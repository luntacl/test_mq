package com.ulic.core.config.service;

import org.springframework.stereotype.Service;

import com.ulic.core.config.bean.ConfigSystem;

@Service
public interface ConfigSystemService {

	public String getValueByKey(final String section, final String keyName);
	
	/**
	 * 查询系统配置记录
	 * @param configSystemId
	 * @return
	 */
	public ConfigSystem findByPrimaryKey(Long configSystemId);
	
	/**
	 * 保存系统配置记录
	 * @param configSystem
	 * @return
	 */
	public boolean saveConfigSystem(ConfigSystem configSystem);
	
	/**
	 * 更新系统配置记录
	 * @param configSystem
	 * @return
	 */
	public boolean updateConfigSystem(ConfigSystem configSystem);
	
	/**
	 * 删除系统配置记录
	 * @param configSystemId
	 * @return
	 */
	public boolean deleteByPrimaryKey(Long configSystemId);
}
