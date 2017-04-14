package com.ulic.core.sms.service;

import com.ulic.core.sms.bean.Sms;

public interface SmsService {

	/**
	 * 保存短信表
	 * @param sms
	 * @return
	 */
	public boolean saveSms(Sms sms);
	
}
