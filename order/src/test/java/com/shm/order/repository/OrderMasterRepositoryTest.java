package com.shm.order.repository;

import com.shm.order.OrderApplicationTests;
import com.shm.order.dataobject.OrderMaster;
import com.shm.order.enums.OrderStatusEnum;
import com.shm.order.enums.PayStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * @Auther: shm
 * @Date: 2019/5/1
 * @Description: com.shm.order.repository
 * @version: 1.0
 */
@Component
public class OrderMasterRepositoryTest extends OrderApplicationTests {
    @Autowired
    private OrderMasterRepository repository;

    public final String OPENID = "52144";

    @Test
    public void save(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("13161111");
        orderMaster.setBuyerName("东方不败");
        orderMaster.setBuyerAddress("峨眉山");
        orderMaster.setBuyerPhone("13766666666");
        orderMaster.setBuyerOpenid(OPENID);
        orderMaster.setOrderAmount(new BigDecimal(43.96));
        orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
        orderMaster.setPayStatus(PayStatusEnum.WAIT.getCode());
        OrderMaster result = repository.save(orderMaster);
        Assert.assertTrue(result != null);
    }

}