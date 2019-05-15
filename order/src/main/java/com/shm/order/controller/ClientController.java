package com.shm.order.controller;

import com.shm.order.client.ProductClient;
import com.shm.order.dataobject.ProductInfo;
import com.shm.order.dto.CartDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther: shm
 * @Date: 2019/5/2
 * @Description: com.shm.order.controller
 * @version: 1.0
 */
@RestController
@Slf4j
public class ClientController {

//    @Autowired
//    private LoadBalancerClient loadBalancerClient;

//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    private ProductClient productClient;

    @GetMapping("/getProductMsg")
    public String getProductMsg(){

        //第一种方式（直接使用RestTemplate，url写死）
//        RestTemplate restTemplate = new RestTemplate();
//        String response = restTemplate.getForObject("http://localhost:8080/msg", String.class);

        //第二种方式（利用loadBalancerClient通过应用名获取url，在使用RestTemplate）
//        ServiceInstance serviceInstance = loadBalancerClient.choose("PRODUCT");
//        String url = String.format("http://%s:%s", serviceInstance.getHost(), serviceInstance.getPort()+"/msg");
//        RestTemplate restTemplate = new RestTemplate();
//        String response = restTemplate.getForObject(url, String.class);

        //第三种方式（利用@LoadBalanced注解，可RestTemplate里直接使用应用名字）
//        String response = restTemplate.getForObject("http://PRODUCT/msg", String.class);

        String response = productClient.productMsg();
        log.info("response={}",response);
        return response;
    }

    @GetMapping("/getProductList")
    public String getProductList(){

        List<ProductInfo> productInfoList = productClient.listForOrder(Arrays.asList("1556017693370105569"));
        log.info("productInfoList={}",productInfoList);
        return "ok";
    }

    @GetMapping("/productDecreaseStock")
    public String productDecreaseStock(){
        CartDTO cartDTO = new CartDTO("4001597627", 2);
        productClient.decreaseStock(Arrays.asList(cartDTO));
        return "success";
    }

}
