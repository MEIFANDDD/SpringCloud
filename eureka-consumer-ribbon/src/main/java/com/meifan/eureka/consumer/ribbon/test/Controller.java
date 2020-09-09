package com.meifan.eureka.consumer.ribbon.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author 梅帆
 * @DATA 2020/9/9 15:08
 * @Contact 530051607@qq.com
 **/
@RestController
public class Controller {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("consumer")
    public String dc(){
        return restTemplate.getForObject("http://eureka-client/dc", String.class);
    }
}