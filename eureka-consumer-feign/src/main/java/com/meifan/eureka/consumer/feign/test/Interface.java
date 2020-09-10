package com.meifan.eureka.consumer.feign.test;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author 梅帆
 * @DATA 2020/9/10 10:25
 * @Contact 530051607@qq.com
 **/
@FeignClient("eureka-client")
public interface Interface {
    @GetMapping("dc")
    String consumer();
}
