package com.shm.order.controller;

import com.shm.order.config.GirlConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: shm
 * @Date: 2019/5/5
 * @Description: com.shm.order.controller
 * @version: 1.0
 */
@RestController
public class GirlController {

    @Autowired
    private GirlConfig girlConfig;

    @RequestMapping("/girl/print")
    public String print(){
        return "name:"+girlConfig.getName()+",age:"+girlConfig.getAge();
    }

}
