package com.ulic.core.channel.service;

import com.ulic.core.basic.BaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ulic.core.channel.bean.Partner;
import com.ulic.core.channel.dao.PartnerMapper;

@Service
@Slf4j
public class PartnerService extends BaseService<Partner> {
    @Autowired
    private PartnerMapper partnerMapper;
}