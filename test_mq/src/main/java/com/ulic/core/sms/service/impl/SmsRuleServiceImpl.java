package com.ulic.core.sms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ulic.core.sms.bean.SmsRule;
import com.ulic.core.sms.bean.SmsRuleKey;
import com.ulic.core.sms.dao.SmsRuleMapper;
import com.ulic.core.sms.service.SmsRuleService;
@Service
public class SmsRuleServiceImpl implements SmsRuleService {

	@Autowired
	private SmsRuleMapper smsRuleMapper;
	
	@Override
	public SmsRule findBySmsRuleKey(SmsRuleKey key) {
		return smsRuleMapper.selectByPrimaryKey(key);
	}

}
