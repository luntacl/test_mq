package com.ulic.core.proposal.dao;


import com.ulic.core.proposal.bean.ProposalForm;
import insure.platform.mybatis.mapper.common.Mapper;

public interface ProposalFormMapper extends Mapper<ProposalForm> {

	int countByProposalFormIdAndStep(ProposalForm proposalForm);
	
	int updateByProposalFormIdAndStep(ProposalForm proposalForm);
}