package com.ulic.core.config.service;

import com.ulic.core.config.bean.ConfigTemplate;

public interface ConfigTemplateService {

	/**
	 * 查询模板配置信息
	 * @param templateId
	 * @return
	 */
	public ConfigTemplate findByPrimaryKey(String templateId);
	
	/**
	 * 保存模板配置信息
	 * @param configTemplate
	 * @return
	 */
	public boolean saveConfigTemplate(ConfigTemplate configTemplate);

	/**
	 * 更新模板配置信息
	 * @param configTemplate
	 * @return
	 */
	public boolean updateConfigTemplate(ConfigTemplate configTemplate);
	
	/**
	 * 删除模板配置信息
	 * @param templateId
	 * @return
	 */
	public boolean deleteByPrimaryKey(String templateId);
	
}
