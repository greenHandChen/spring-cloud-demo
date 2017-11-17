package com.cloudConfigClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by enHui.Chen on 2017/11/17 0017.
 */
@SpringBootApplication
public class CloudConfigClient {
    public static void main(String[] args) {
        SpringApplication.run(CloudConfigClient.class, args);
    }
}
