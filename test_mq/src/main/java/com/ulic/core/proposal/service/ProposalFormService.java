package com.ulic.core.proposal.service;

import java.util.Date;
import java.util.List;

import com.ulic.common.id.BasicEntityIdGenerator;
import com.ulic.core.basic.BaseService;
import com.ulic.core.proposal.bean.ProposalForm;
import com.ulic.core.proposal.dao.ProposalFormMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProposalFormService extends BaseService<ProposalForm> {
	@Autowired
	private ProposalFormMapper proposalFormMapper;

	public int saveOrUpdateProposalForm(ProposalForm app) {
		
		int count = proposalFormMapper.countByProposalFormIdAndStep(app);
		if (count > 0) {			
			app.setUpdatedTime(new Date());
			return proposalFormMapper.updateByProposalFormIdAndStep(app);
		}else{
			app.setProposalFormUniqId(BasicEntityIdGenerator.getInstance().generateLongIdString());
			return proposalFormMapper.insertSelective(app);
		}
	}
	
	
	public List<ProposalForm> selectProposalFormByKey(ProposalForm proposalForm) {
		return proposalFormMapper.select(proposalForm);
	}
	
}