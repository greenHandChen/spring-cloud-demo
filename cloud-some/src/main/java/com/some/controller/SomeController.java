package com.some.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Created by enHui.Chen on 2017/9/26 0026.
 */
@RestController
public class SomeController {
    @Value("${my.message}")
    private String msg;

    @RequestMapping("/getMsg")
    public String getMsg() {
        return "hello: " + msg;
    }
}
