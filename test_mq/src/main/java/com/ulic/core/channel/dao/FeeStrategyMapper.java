package com.ulic.core.channel.dao;

import org.apache.ibatis.annotations.Param;

import com.ulic.core.channel.bean.FeeStrategy;
import insure.platform.mybatis.mapper.common.Mapper;

public interface FeeStrategyMapper extends Mapper<FeeStrategy> {

	FeeStrategy selectFeeStrategyByProChannel(@Param("channelId") String channelId, @Param("metadataId") String metadataId);
   
}