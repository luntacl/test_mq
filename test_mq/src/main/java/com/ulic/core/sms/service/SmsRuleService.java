package com.ulic.core.sms.service;

import org.springframework.cache.annotation.Cacheable;

import com.ulic.core.sms.bean.SmsRule;
import com.ulic.core.sms.bean.SmsRuleKey;

public interface SmsRuleService {

	/**
	 * 根据主键查询短信规则
	 * @param key
	 * @return
	 */
	@Cacheable(value = "SmsRuleService")
	SmsRule findBySmsRuleKey(SmsRuleKey key);
}
