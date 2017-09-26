package com.ui.service;

import com.ui.domain.Person;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by enHui.Chen on 2017/9/26 0026.
 */
@FeignClient("person")// 指明服务，之后将会调用服务对应的方法
public interface PersonService {
    @RequestMapping(method= RequestMethod.POST,value = "/savePerson",
            produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    List<Person> save(@RequestBody String name);
}
