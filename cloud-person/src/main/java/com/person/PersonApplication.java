package com.person;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by enHui.Chen on 2017/9/26 0026.
 */
@SpringBootApplication
// 开启对服务发现-客户端的支持
@EnableEurekaClient
public class PersonApplication {
    public static void main(String[] args) {
        SpringApplication.run(PersonApplication.class, args);
    }
}
