package com.ulic.core.proposal.service;

import com.ulic.core.basic.BaseService;
import com.ulic.core.proposal.bean.ProposalFormRecord;
import com.ulic.core.proposal.dao.ProposalFormRecordMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Slf4j
public class ProposalFormRecordService extends BaseService<ProposalFormRecord> {
    @Autowired
    private ProposalFormRecordMapper proposalFormRecordMapper;
    public int saveProposalFormRecord(ProposalFormRecord proposalFormRecord) {
		return proposalFormRecordMapper.insertSelective(proposalFormRecord);
		
	}
	

	
}