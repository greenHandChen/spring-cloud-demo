package com.ui.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.ui.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by enHui.Chen on 2017/9/26 0026.
 */
@Service
public class PersonHystrixService {
    @Autowired
    PersonService personService;
    @HystrixCommand(fallbackMethod = "fallbackSave")// 当调用这个方法出现问题时，将调用这个断路方法
    public List<Person> save(String name){
        return personService.save(name);
    }
    // 断路方法
    public List<Person> fallbackSave(String name){
        List<Person> list = new ArrayList<Person>();
        Person person = new Person();
        person.setName("保存person出现错误");
        list.add(person);
        return list;
    }
}
