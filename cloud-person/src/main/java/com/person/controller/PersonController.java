package com.person.controller;

import com.person.dao.PersonRepository;
import com.person.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by enHui.Chen on 2017/9/26 0026.
 */
@RestController
public class PersonController {
    @Autowired
    PersonRepository personRepository;

    @RequestMapping(value = "/savePerson",method = RequestMethod.POST)
    public List<Person> savePerson(@RequestBody String name) {
        Person person = new Person();
        person.setName(name);
        personRepository.save(person);
        return personRepository.findAll(new PageRequest(0, 10)).getContent();
    }

    @RequestMapping("/findByName")
    public List<Person> findByName(String name) {
       return personRepository.findByName(name);
    }
}
