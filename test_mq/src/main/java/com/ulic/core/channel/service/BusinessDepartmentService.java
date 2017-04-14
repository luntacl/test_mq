package com.ulic.core.channel.service;

import com.ulic.core.basic.BaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ulic.core.channel.bean.BusinessDepartment;
import com.ulic.core.channel.dao.BusinessDepartmentMapper;

@Service
@Slf4j
public class BusinessDepartmentService extends BaseService<BusinessDepartment> {
    @Autowired
    private BusinessDepartmentMapper businessDepartmentMapper;
}