package com.cloudConfigClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by enHui.Chen on 2017/11/17 0017.
 */
@RestController
public class TestController {
    @Value("${spring.datasource.driver-class-name}")
    private String a;

    @RequestMapping("/test")
    public String test() {
        return a;
    }
}
