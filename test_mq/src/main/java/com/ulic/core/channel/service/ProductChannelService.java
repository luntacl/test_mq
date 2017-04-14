package com.ulic.core.channel.service;

import java.util.List;
import java.util.Map;

import com.ulic.common.id.BasicEntityIdGenerator;
import com.ulic.core.basic.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;


import com.ulic.core.channel.bean.ProductChannel;
import com.ulic.core.channel.dao.ProductChannelMapper;
import lombok.SneakyThrows;

@Service
public class ProductChannelService extends BaseService<ProductChannel> {
    @Autowired
    private ProductChannelMapper productChannelMapper;
    
    /**
	 * 生成带自增序列的 product_channel
	 */
	@SneakyThrows
	public String createProductChannel(ProductChannel productChannel) {
		String productChannelId = BasicEntityIdGenerator.getInstance().generateLongIdString();
		productChannel.setProductChannelId(productChannelId);
		insertSelective(productChannel);
		return productChannelId;
	}
	@Cacheable(value = "findByKeyAndPlatform")
	public ProductChannel findByKeyAndPlatform(String string, String string2, String string3) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Map<String, Object> getProductchannelBymetadataId(String productmetadataId){
		return productChannelMapper.getProductchannelBymetadataId(productmetadataId);
	}
}