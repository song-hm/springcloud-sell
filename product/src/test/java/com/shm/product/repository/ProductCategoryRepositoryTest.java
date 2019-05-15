package com.shm.product.repository;

import com.shm.product.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
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
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> productCategoryList = repository.findByCategoryTypeIn(Arrays.asList(2, 3, 4));
        Assert.assertTrue(productCategoryList.size() > 0);

    }
}