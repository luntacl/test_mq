package com.ulic.core.sms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ulic.core.sms.bean.SmsTemplate;
import com.ulic.core.sms.dao.SmsTemplateMapper;
import com.ulic.core.sms.service.SmsTemplateService;
@Service("smsTemplateServiceImpl")
public class SmsTemplateServiceImpl implements SmsTemplateService {

	@Autowired
	private SmsTemplateMapper smsTemplateMapper;
	
	@Override
	public SmsTemplate findByTemplateId(String templateId) {
		return smsTemplateMapper.selectByPrimaryKey(templateId);
	}

}
