package com.ulic.core.channel.dao;

import com.ulic.core.channel.bean.Channel;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.cache.annotation.Cacheable;

public interface ChannelMapper {
//	@Cacheable("selectByPrimaryKey")
//	@Select("SELECT * from channel where channel_id=#{channelId}")
	Channel selectByPrimaryKey(String channelId);
}