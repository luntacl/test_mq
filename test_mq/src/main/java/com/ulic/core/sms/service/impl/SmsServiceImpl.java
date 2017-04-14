package com.ulic.core.sms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ulic.core.sms.bean.Sms;
import com.ulic.core.sms.dao.SmsMapper;
import com.ulic.core.sms.service.SmsService;

@Service
public class SmsServiceImpl implements SmsService {

	@Autowired
	private SmsMapper smsMapper;
	
	@Override
	public boolean saveSms(Sms sms) {
		return smsMapper.insertSelective(sms) == 1;
	}

}
