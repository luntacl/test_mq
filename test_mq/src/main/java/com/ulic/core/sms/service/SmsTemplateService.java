package com.ulic.core.sms.service;

import org.springframework.cache.annotation.Cacheable;

import com.ulic.core.sms.bean.SmsTemplate;

public interface SmsTemplateService {

	/**
	 * 根据模板编号查询模板
	 * @param templateId
	 * @return
	 */
	public SmsTemplate findByTemplateId(String templateId);
	
}
