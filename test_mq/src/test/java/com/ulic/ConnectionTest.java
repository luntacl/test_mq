package com.ulic;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by liutao on 2017/4/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class ConnectionTest {

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void DBTest() {
        stringRedisTemplate.opsForValue().set("aaa","111");
        Assert.assertEquals("111", stringRedisTemplate.opsForValue().get("aaa"));
    }

//    @Test
//    public void redisTest() {
//
//    }

}
