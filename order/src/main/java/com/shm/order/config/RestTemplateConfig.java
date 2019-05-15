package com.shm.order.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: shm
 * @Date: 2019/5/2
 * @Description: com.shm.order.config
 * @version: 1.0
 */
@Component
public class RestTemplateConfig {

//    @Bean
//    @LoadBalanced
//    public RestTemplate restTemplate(){
//        return new RestTemplate();
//    }
}
