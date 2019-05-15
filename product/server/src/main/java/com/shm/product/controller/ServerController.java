package com.shm.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: shm
 * @Date: 2019/5/2
 * @Description: com.shm.product.controller
 * @version: 1.0
 */
@RestController
public class ServerController {

    @GetMapping("/msg")
    public String msg(){
        return "this is product' msg";
    }
}
