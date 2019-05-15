package com.shm.order.controller;

import com.shm.order.dto.OrderDTO;
import com.shm.order.message.StreamClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Auther: shm
 * @Date: 2019/5/6
 * @Description: com.shm.order.controller
 * @version: 1.0
 */
@RestController
public class SendMessageController {

    @Autowired
    private StreamClient streamClient;
/*
    @RequestMapping("/sendMessage")
    public void process(){
        streamClient.output().send(MessageBuilder.withPayload("now"+new Date()).build());
    }*/

    /**
     * 发送orderDTO对象
     */
    @RequestMapping("/sendMessage")
    public void process(){
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setOrderId("1234411545");
        streamClient.output().send(MessageBuilder.withPayload(orderDTO).build());
    }
}
