package com.example.springbootcompleteproject.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariableController2 {

    @RequestMapping("/text/{name}")
    public String hi(@PathVariable String name){

        return "Welcome to path variable "+name;
    }

    @RequestMapping("/salary/{name}")
    public String mySalary(@PathVariable String name){

        return "my salary is very high "+name;
    }

}
