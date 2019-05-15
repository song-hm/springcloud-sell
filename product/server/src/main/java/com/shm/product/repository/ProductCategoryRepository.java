package com.shm.product.repository;

import com.shm.product.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Auther: shm
 * @Date: 2019/5/1
 * @Description: com.shm.product.repository
 * @version: 1.0
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
