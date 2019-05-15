package com.shm.order;

import com.shm.order.dto.OrderDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * 发送mq消息测试
 * @Auther: shm
 * @Date: 2019/5/6
 * @Description: com.shm.order
 * @version: 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MySenderTest {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Test
    public void send(){
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setOrderId("68492626");
        amqpTemplate.convertAndSend("myQueue",orderDTO);
    }

    @Test
    public void sendOrder(){
        amqpTemplate.convertAndSend("myOrder","computer","now"+new Date());
    }
}
