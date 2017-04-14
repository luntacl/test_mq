package com.ulic.core.rabbitmq.impl;

import com.ulic.core.rabbitmq.Consumer;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by liutao on 2017/4/13.
 */
@Component
@RabbitListener(queues = "test_queuetwo")
public class TestConsumerTwo implements Consumer {

    @Override
    @RabbitHandler
    public void process(String message) {
        System.out.println("test_queuetwo: "+message);
    }
}
