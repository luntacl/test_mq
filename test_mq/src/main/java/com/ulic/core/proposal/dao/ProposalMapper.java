package com.ulic.core.proposal.dao;


import com.ulic.core.proposal.bean.Proposal;
import insure.platform.mybatis.mapper.common.Mapper;

public interface ProposalMapper extends Mapper<Proposal> {

	int updateProposalStatusByProposalFromId(Proposal proposal);

	Proposal findByFormId(Long formId);

	Proposal findPhone(String proposalFromId);
	
	String getProposalFormIdByTradeId(String tradeId);

}