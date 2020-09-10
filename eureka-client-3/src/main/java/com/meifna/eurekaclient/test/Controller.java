package com.meifna.eurekaclient.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 梅帆
 * @DATA 2020/9/9 10:28
 * @Contact 530051607@qq.com
 **/
@RestController
public class Controller {
    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("dc")
    public String dc() {
        String services = "client-3";
        return services;
    }
}
