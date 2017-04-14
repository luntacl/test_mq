package com.ulic.core.channel.dao;

import java.util.Map;

import com.ulic.core.channel.bean.ProductChannel;
import insure.platform.mybatis.mapper.common.Mapper;

public interface ProductChannelMapper extends Mapper<ProductChannel> {
	
	Map<String, Object> getProductchannelBymetadataId(String productmetadataId);
}