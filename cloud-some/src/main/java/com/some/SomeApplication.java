package com.some;

        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by enHui.Chen on 2017/9/26 0026.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SomeApplication {
    public static void main(String[] args) {
        SpringApplication.run(SomeApplication.class, args);
    }
}
