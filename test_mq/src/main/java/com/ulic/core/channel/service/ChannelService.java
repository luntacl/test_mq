package com.ulic.core.channel.service;

import com.ulic.core.basic.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.ulic.core.channel.bean.Channel;
import com.ulic.core.channel.dao.ChannelMapper;

@Service
public class ChannelService {

    @Autowired
    private ChannelMapper channelMapper;

    public Channel selectByPrimaryKey(String channelId) {
    	
		return channelMapper.selectByPrimaryKey(channelId);
	}
}