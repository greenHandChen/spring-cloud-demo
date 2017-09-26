package com.person.dao;

import com.person.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by enHui.Chen on 2017/9/26 0026.
 */
public interface PersonRepository extends JpaRepository<Person,Long> {
    List<Person> findByName(String name);
}
