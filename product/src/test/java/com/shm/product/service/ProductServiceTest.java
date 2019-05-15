package com.shm.product.service;

import com.shm.product.ProductApplicationTests;
import com.shm.product.dataobject.ProductInfo;
import com.shm.product.dto.CartDTO;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Auther: shm
 * @Date: 2019/5/1
 * @Description: com.shm.product.service
 * @version: 1.0
 */
@Component
public class ProductServiceTest extends ProductApplicationTests {

    @Autowired
    private ProductService productService;
    @Test
    public void findAllUp() {
        List<ProductInfo> productInfoList = productService.findAllUp();
        Assert.assertTrue(productInfoList.size() > 0);

    }


    @Test
    public void findList(){
        List<ProductInfo> productInfoList = productService.findList(Arrays.asList("4001597567", "4001597627"));
        Assert.assertTrue(productInfoList.size() > 0);
    }

    @Test
    public void decreaseStock(){
        CartDTO cartDTO = new CartDTO("4001597627", 2);
        productService.decreaseStock(Arrays.asList(cartDTO));

    }

}