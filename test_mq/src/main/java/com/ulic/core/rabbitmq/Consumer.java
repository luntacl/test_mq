package com.ulic.core.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by liutao on 2017/4/11.
 */
//@Component
//@RabbitListener(queues="queue_one")
//public class Consumer {
//   @RabbitHandler
//    public void process(String message) {
//        System.out.println("Receive:"+message);
//
//    }
//}
public interface Consumer {

    void process(String message);

}