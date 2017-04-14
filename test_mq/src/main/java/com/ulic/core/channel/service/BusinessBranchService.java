package com.ulic.core.channel.service;

import com.ulic.common.id.BasicEntityIdGenerator;
import com.ulic.core.basic.BaseService;
import com.ulic.core.channel.bean.BusinessBranch;
import com.ulic.core.channel.dao.BusinessBranchMapper;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessBranchService extends BaseService<BusinessBranch> {
    @Autowired
    private BusinessBranchMapper businessBranchMapper;

    @SneakyThrows
    public String saveBusinessBranch(BusinessBranch businessBranch) {
        String businessBranchId = BasicEntityIdGenerator.getInstance().generateLongIdString();
        businessBranch.setBranchId(businessBranchId);
        businessBranchMapper.insertSelective(businessBranch);
        return businessBranchId;
    }
    public int flushCache() {
        return businessBranchMapper.flushCache();
    }
}
