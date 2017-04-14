package com.ulic.core.rabbitmq.impl;

import com.ulic.core.batchhandler.SyncDataBatchHandler;
import com.ulic.core.rabbitmq.Consumer;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by liutao on 2017/4/13.
 */

@Component
@RabbitListener(queues = "syncData_queue")
public class SyncDataQueueConsumer implements Consumer {
    @Autowired
    private SyncDataBatchHandler handler;

    @Override
    public void process(String message) {
        handler.add(message);
    }
}
