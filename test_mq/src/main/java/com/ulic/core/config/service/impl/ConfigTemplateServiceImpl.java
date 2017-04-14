package com.ulic.core.config.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ulic.core.config.bean.ConfigTemplate;
import com.ulic.core.config.dao.ConfigTemplateMapper;
import com.ulic.core.config.service.ConfigTemplateService;


@Service
public class ConfigTemplateServiceImpl implements ConfigTemplateService {

	private static final Logger logger = LoggerFactory.getLogger(ConfigTemplateServiceImpl.class);
	@Autowired
	private ConfigTemplateMapper configTemplateMapper;
	
	/**
	 * 查询模板配置信息
	 * @param templateId
	 * @return
	 */
	@Override
	public ConfigTemplate findByPrimaryKey(String templateId) {
		try {
			return configTemplateMapper.selectByPrimaryKey(templateId);
		} catch (Exception e) {
			logger.error("====ConfigTemplateService.findByPrimaryKey Exception====",e);
			return null;
		}
	}

	/**
	 * 保存模板配置信息
	 * @param configTemplate
	 * @return
	 */
	@Override
	public boolean saveConfigTemplate(ConfigTemplate configTemplate) {
		try {
			return configTemplateMapper.insertSelective(configTemplate) == 1;
		} catch (Exception e) {
			logger.error("====ConfigTemplateService.saveConfigTemplate Exception====",e);
			return false;
		}
	}

	/**
	 * 更新模板配置信息
	 * @param configTemplate
	 * @return
	 */
	@Override
	public boolean updateConfigTemplate(ConfigTemplate configTemplate) {
		try {
			return configTemplateMapper.updateByPrimaryKeySelective(configTemplate) == 1;
		} catch (Exception e) {
			logger.error("====ConfigTemplateService.updateConfigTemplate Exception====",e);
			return false;
		}
	}

	/**
	 * 删除模板配置信息
	 * @param templateId
	 * @return
	 */
	@Override
	public boolean deleteByPrimaryKey(String templateId) {
		try {
			return configTemplateMapper.deleteByPrimaryKey(templateId) == 1;
		} catch (Exception e) {
			logger.error("====ConfigTemplateService.deleteByPrimaryKey Exception====",e);
			return false;
		}
	}

}
