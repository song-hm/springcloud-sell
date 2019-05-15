package com.shm.order.repository;

import com.shm.order.OrderApplicationTests;
import com.shm.order.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Auther: shm
 * @Date: 2019/5/1
 * @Description: com.shm.order.repository
 * @version: 1.0
 */
@Component
public class OrderDetailRepositoryTest extends OrderApplicationTests {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Test
    public void findByOrderId() {
        List<OrderDetail> orderDetailList = orderDetailRepository.findByOrderId("1556347955396931612");
        Assert.assertTrue(orderDetailList.size() > 0);
    }
}