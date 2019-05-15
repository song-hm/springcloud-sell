package com.shm.product.service;

import com.shm.product.ProductApplicationTests;
import com.shm.product.dataobject.ProductCategory;
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
public class CategoryServiceTest extends ProductApplicationTests {

    @Autowired
    private CategoryService categoryService;

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> categoryList = categoryService.findByCategoryTypeIn(Arrays.asList(5, 6, 7, 8));
        Assert.assertTrue(categoryList.size() > 0);
    }
}