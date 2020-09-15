package com.meifan.stram.rabbitmq.test;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * @Author 梅帆
 * @DATA 2020/9/15 17:48
 * @Contact 530051607@qq.com
 **/
@EnableBinding(Sink.class)
public class SinkReceiver {
    @StreamListener(Sink.INPUT)
    public void receive(Object payload){
        System.out.println("接收:" + payload);
    }
}
