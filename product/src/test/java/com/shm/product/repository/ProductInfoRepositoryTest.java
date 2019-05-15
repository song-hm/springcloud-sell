package com.shm.product.repository;

import com.shm.product.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Auther: shm
 * @Date: 2019/5/1
 * @Description: com.shm.product.repository
 * @version: 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository repository;

    @Test
    public void findByProductStatus() {
        List<ProductInfo> productInfoList = repository.findByProductStatus(0);
        Assert.assertTrue(productInfoList.size() > 0);
    }

    @Test
    public void findByProductIdIn(){
        List<ProductInfo> productInfoList = repository.findByProductIdIn(Arrays.asList("4001597567", "4001597627"));
        Assert.assertTrue(productInfoList.size() > 0);
    }
}