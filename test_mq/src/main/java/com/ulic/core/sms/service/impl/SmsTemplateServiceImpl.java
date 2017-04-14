package com.ulic.core.sms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.ulic.core.sms.bean.SmsTemplate;
import com.ulic.core.sms.dao.SmsTemplateMapper;
import com.ulic.core.sms.service.SmsTemplateService;
@Service("smsTemplateServiceImpl")
public class SmsTemplateServiceImpl implements SmsTemplateService {

	@Autowired
	private SmsTemplateMapper smsTemplateMapper;
	
	@Override
	@Cacheable(value = "template", key = "#templateId")
	public SmsTemplate findByTemplateId(String templateId) {
		System.out.println("从数据库读取----------------");
		return smsTemplateMapper.selectByPrimaryKey(templateId);
	}

}
