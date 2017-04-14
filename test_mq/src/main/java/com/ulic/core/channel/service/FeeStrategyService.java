package com.ulic.core.channel.service;

import com.ulic.common.id.BasicEntityIdGenerator;
import com.ulic.core.basic.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ulic.core.channel.bean.FeeStrategy;
import com.ulic.core.channel.dao.FeeStrategyMapper;
import lombok.SneakyThrows;

@Service
public class FeeStrategyService extends BaseService<FeeStrategy> {
    @Autowired
    private FeeStrategyMapper feeStrategyMapper;

    @SneakyThrows
	public String createTradeProposal(FeeStrategy feeStrategy) {
		String feeStrategyId = BasicEntityIdGenerator.getInstance().generateLongIdString();
		feeStrategy.setFeeStrategyId(feeStrategyId);
		insertSelective(feeStrategy);
		return feeStrategyId;
	}

	public FeeStrategy getFeeStrategy(String channelId, String metadataId) {
		return feeStrategyMapper.selectFeeStrategyByProChannel(channelId, metadataId);
	}
}