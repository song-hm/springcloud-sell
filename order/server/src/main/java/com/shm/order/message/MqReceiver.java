package com.shm.order.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Auther: shm
 * @Date: 2019/5/6
 * @Description: com.shm.order.message
 * @version: 1.0
 */
@Slf4j
@Component
public class MqReceiver {

    //    @RabbitListener(queues = "myQueue")
    //自动创建队列  @RabbitListener(queuesToDeclare = @Queue("myQueue"))
    //Exchange和队列绑定
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue("myQueue"),exchange = @Exchange("myExchange")
    ))
    public void process(Object message){
        log.info("myReceiver={}",message);
    }

    /**
     * 数码供应商服务，接收消息
     * @param message
     */
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue("computerOrder"),key = "computer",exchange = @Exchange("myOrder")
    ))
    public void processComputer(String message){
        log.info("computer MqReceiver={}",message);
    }

    /**
     * 水果供应商服务，接收消息
     * @param message
     */
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue("fruitOrder"),key = "fruit",exchange = @Exchange("myOrder")
    ))
    public void processFruit(String message){
        log.info("fruit MqReceiver={}",message);
    }
}
