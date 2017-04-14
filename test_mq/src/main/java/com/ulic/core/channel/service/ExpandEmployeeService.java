package com.ulic.core.channel.service;

import com.ulic.core.basic.BaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ulic.core.channel.bean.ExpandEmployee;
import com.ulic.core.channel.dao.ExpandEmployeeMapper;

@Service
@Slf4j
public class ExpandEmployeeService extends BaseService<ExpandEmployee> {
    @Autowired
    private ExpandEmployeeMapper expandEmployeeMapper;
}