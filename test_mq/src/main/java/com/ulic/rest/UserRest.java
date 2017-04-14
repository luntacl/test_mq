package com.ulic.rest;

import com.sun.tools.javac.util.Assert;
import com.ulic.core.batchhandler.SmsBatchHandler;
import com.ulic.core.channel.bean.Channel;
import com.ulic.core.channel.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;


/**
 * Created by liutao on 2017/4/11.
 */
@RestController
@RequestMapping("api/user")
public class UserRest {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private ChannelService channelService;

    @Autowired
    private SmsBatchHandler smsBatchHandler;

    @RequestMapping(value = "testRedis", method = RequestMethod.GET)
    public String testRedis(
//            @RequestParam("userName") String name,@RequestParam("userAge") String age
    ) {
//        Channel channel = channelService.selectByPrimaryKey("101");
//        System.out.print(channel.getChannelName());
//        return channel.toString();

        stringRedisTemplate.opsForValue().set("aaa", "111");
        return stringRedisTemplate.opsForValue().get("aaa");
    }

    @RequestMapping(value = "sms", method = RequestMethod.GET)
    public void testsendSMS() {
//        smsBatchHandler.sendMessage("YIL0121JK05003170000076");
    }
}

