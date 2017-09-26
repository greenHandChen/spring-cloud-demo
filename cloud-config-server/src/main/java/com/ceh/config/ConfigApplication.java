package com.ceh.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by enHui.Chen on 2017/9/26 0026.
 */
@SpringBootApplication
// 开启配置服务: 用于对其他项目的配置文件进行额外的配置
@EnableConfigServer
// 开启作为Eureka server的客户端支持
@EnableEurekaClient
public class ConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
    }
}
