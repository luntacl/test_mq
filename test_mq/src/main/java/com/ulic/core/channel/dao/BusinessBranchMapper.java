package com.ulic.core.channel.dao;

import com.ulic.core.channel.bean.BusinessBranch;
import insure.platform.mybatis.mapper.common.Mapper;


public interface BusinessBranchMapper extends Mapper<BusinessBranch> {

    int flushCache();
}