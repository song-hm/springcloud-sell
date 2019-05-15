package com.shm.product.service;

import com.shm.product.dataobject.ProductCategory;

import java.util.List;

/**
 * @Auther: shm
 * @Date: 2019/5/1
 * @Description: com.shm.product.service 类目
 * @version: 1.0
 */
public interface CategoryService {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
