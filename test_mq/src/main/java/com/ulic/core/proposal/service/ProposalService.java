package com.ulic.core.proposal.service;

import java.util.List;

import com.ulic.core.basic.BaseService;
import com.ulic.core.proposal.bean.Proposal;
import com.ulic.core.proposal.dao.ProposalMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ProposalService extends BaseService<Proposal> {
	@Autowired
	private ProposalMapper proposalMapper;

	public Proposal findByProposalId(String proposalNo) {
		// TODO Auto-generated method stub

		return proposalMapper.selectByPrimaryKey(proposalNo);
	}

	public int saveProposal(Proposal proposal) {

		return proposalMapper.insertSelective(proposal);

	}

	public boolean updateSignatureStatusByproposalId(String proposalId, int proposalStatus, int signatureStatus) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateProposalStatusByproposalId(String proposalId, int proposalStatus) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public int  updateProposalStatusByProposalFromId(Proposal proposal) {
		return proposalMapper.updateProposalStatusByProposalFromId(proposal);
	}
	public List<Proposal> getCommonInfo(String proposalFormId) {
		Proposal p = new Proposal();
		p.setProposalFormId(proposalFormId);
		p.setProposalStatus(0);
		return proposalMapper.select(p);

	}

	public Proposal findByFormid(Long formId) {
		return proposalMapper.findByFormId(formId);
	}

	
	/**
	 * add by Mins
	 * @param tradeId
	 * @return
	 */
	public String getProposalFormIdByTradeId(String tradeId) {
		return proposalMapper.getProposalFormIdByTradeId(tradeId);
	}

	
	public Proposal findPhoneByProposalFromId(String proposalFromId){
		Proposal proposal =new Proposal();
		proposal=proposalMapper.findPhone(proposalFromId);
		return proposal;
	}
	
	
	


}