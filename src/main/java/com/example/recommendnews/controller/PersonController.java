package com.example.recommendnews.controller;

import com.example.recommendnews.dao.PersonMapper;
import com.example.recommendnews.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author 11103882
 * @Date 2019/8/28
 * @Version 1.0
 */
@RestController
public class PersonController {

    @Autowired
    private PersonMapper personMapper;

    @RequestMapping("/get/{id}")
    public Person getPerson(@PathVariable("id") Integer id){

        return personMapper.getById(id);
    }
}
