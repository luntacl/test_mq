package com.ulic.rest;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by liutao on 2017/4/12.
 */
@RestController
@RequestMapping("test")
public class ConnectionRest {

    @Resource
    private StringRedisTemplate stringRedisTemplate;
    @RequestMapping("hello")
    public String index() {
        // 保存字符串
        stringRedisTemplate.opsForValue().set("aaa", "222");
        String string = stringRedisTemplate.opsForValue().get("aaa");
        System.out.println(string);
        return "Hello World";
    }
}
