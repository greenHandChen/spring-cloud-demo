package com.ui.controller;

import com.ui.domain.Person;
import com.ui.service.PersonHystrixService;
import com.ui.service.SomeHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by enHui.Chen on 2017/9/26 0026.
 */
@RestController
public class UiController {
    @Autowired
    PersonHystrixService phs;
    @Autowired
    SomeHystrixService shs;

     /**
       * @Author: enHui.Chen
       * @Description: 分发转向到PERSON服务
       * @Data 2017/9/26 0026
       */
    @RequestMapping("/personDispatch")
    public List<Person> personDispatch(@RequestBody String name){
        return phs.save(name);
    }

    @RequestMapping(value = "/someDispatch",produces={MediaType.TEXT_PLAIN_VALUE})
    public String someDispatch(){
        return  shs.getSome();
    }

}
