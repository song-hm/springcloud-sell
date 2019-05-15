package com.shm.product.controller;

import com.shm.product.VO.ProductInfoVO;
import com.shm.product.VO.ProductVO;
import com.shm.product.VO.ResultVO;
import com.shm.product.common.DecreaseStockInput;
import com.shm.product.dataobject.ProductCategory;
import com.shm.product.dataobject.ProductInfo;
import com.shm.product.dto.CartDTO;
import com.shm.product.service.CategoryService;
import com.shm.product.service.ProductService;
import com.shm.product.utils.ResultVOUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Auther: shm
 * @Date: 2019/5/1
 * @Description: com.shm.product.controller 商品
 * @version: 1.0
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    /**
     * 1. 查询所有在架的商品
     * 2. 获取类目type列表
     * 3. 查询类目
     * 4. 构造数据
     */

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public ResultVO<ProductVO> list(){

        //1. 查询所有在架的商品
        List<ProductInfo> productInfoList = productService.findAllUp();

        //2. 获取类目type列表
        List<Integer> categoryList = productInfoList.stream()
                .map(ProductInfo::getCategoryType).collect(Collectors.toList());


        //3. 从数据库中查询类目
        List<ProductCategory> productCategoryList = categoryService.findByCategoryTypeIn(categoryList);

        //4. 构造数据
        List<ProductVO> productVOList = new ArrayList<>();
        for (ProductCategory productCategory : productCategoryList) {
            ProductVO productVO = new ProductVO();
            productVO.setCategoryName(productCategory.getCategoryName());
            productVO.setCategoryType(productCategory.getCategoryType());

            List<ProductInfoVO> productInfoVOList = new ArrayList<>();
            for (ProductInfo productInfo : productInfoList) {
                ProductInfoVO productInfoVO = new ProductInfoVO();
                BeanUtils.copyProperties(productInfo,productInfoVO);
                productInfoVOList.add(productInfoVO);
            }
            productVO.setProductInfoVOList(productInfoVOList);
            productVOList.add(productVO);
        }

        return ResultVOUtil.success(productVOList);
    }

    //获取商品列表（给订单服务使用）
    @PostMapping("/listForOrder")
    public List<ProductInfo> listForOrder(@RequestBody List<String> productIdList) throws Exception{

//        Thread.sleep(2000);
        return productService.findList(productIdList);
    }

    @PostMapping("/decreaseStock")
    public void decreaseStock(@RequestBody List<DecreaseStockInput> decreaseStockInputList){
        productService.decreaseStock(decreaseStockInputList);
    }
}
