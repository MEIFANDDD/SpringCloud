package com.meifan.eureka.consumer.ribbon.test;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author 梅帆
 * @DATA 2020/9/10 17:03
 * @Contact 530051607@qq.com
 **/
@Service
public class ConsumerService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "error")
    public String consumer(){
        return restTemplate.getForObject("http://eureka-client/dc", String.class);
    }

    public String error(){
        return "error!";
    }
}
