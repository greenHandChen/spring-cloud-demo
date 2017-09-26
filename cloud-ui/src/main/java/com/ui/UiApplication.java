package com.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by enHui.Chen on 2017/9/26 0026.
 */
@SpringBootApplication
@EnableEurekaClient
// 开启对feign客户端的支持
@EnableFeignClients
// 开启对断路器的支持
@EnableCircuitBreaker
// 开启对路由代理的支持
@EnableZuulProxy
public class UiApplication {
    public static void main(String[] args){
        SpringApplication.run(UiApplication.class,args);
    }
}
