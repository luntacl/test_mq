package com.ulic.core.sms.dao;

import com.ulic.core.sms.bean.Sms;

public interface SmsMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sms
	 * @mbggenerated  Wed Aug 10 10:43:30 GMT+08:00 2016
	 */
	int deleteByPrimaryKey(Long smsId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sms
	 * @mbggenerated  Wed Aug 10 10:43:30 GMT+08:00 2016
	 */
	int insert(Sms record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sms
	 * @mbggenerated  Wed Aug 10 10:43:30 GMT+08:00 2016
	 */
	int insertSelective(Sms record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sms
	 * @mbggenerated  Wed Aug 10 10:43:30 GMT+08:00 2016
	 */
	Sms selectByPrimaryKey(Long smsId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sms
	 * @mbggenerated  Wed Aug 10 10:43:30 GMT+08:00 2016
	 */
	int updateByPrimaryKeySelective(Sms record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sms
	 * @mbggenerated  Wed Aug 10 10:43:30 GMT+08:00 2016
	 */
	int updateByPrimaryKey(Sms record);
}