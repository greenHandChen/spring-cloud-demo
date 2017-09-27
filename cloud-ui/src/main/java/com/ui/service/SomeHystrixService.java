package com.ui.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by enHui.Chen on 2017/9/26 0026.
 */
@Service
public class SomeHystrixService {
    @Autowired
    RestTemplate restTemplate;// rest服务模板，spring-boot已为我们做好配置

    @HystrixCommand(fallbackMethod = "fallbackSome")// 当调用该方法失败时，将调用断路方法
    public String getSome() {
        return restTemplate.getForObject("http://some/getMsg", String.class);
    }

    public String fallbackSome() {
        return "some service has broken!";
    }

}
