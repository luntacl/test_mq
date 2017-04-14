package com.ulic.core.rabbitmq.impl;

import com.ulic.core.batchhandler.SmsBatchHandler;
import com.ulic.core.rabbitmq.Consumer;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 发送短信消息队列
 * Created by liutao on 2017/4/13.
 */
@Component
@RabbitListener(queues = "sms_queue")
public class SmsQueueConsumer implements Consumer {

    @Autowired
    private SmsBatchHandler handler;
    @Override
    public void process(String message) {
        handler.add(message);
    }
}
