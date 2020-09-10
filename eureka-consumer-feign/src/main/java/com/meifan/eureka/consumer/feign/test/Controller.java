package com.meifan.eureka.consumer.feign.test;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 梅帆
 * @DATA 2020/9/10 10:22
 * @Contact 530051607@qq.com
 **/
@RestController
public class Controller {
    @Autowired
    Interface i;
    @GetMapping("consumer")
    public String dc(){
        return i.consumer();
    }
}
