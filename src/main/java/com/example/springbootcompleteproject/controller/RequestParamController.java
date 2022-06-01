package com.example.springbootcompleteproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParamController {

    @RequestMapping("/accept")
    public String hope(@RequestParam String name){

        return "Welcome to Request param "+name;
    }

    @RequestMapping("/my_marks")
    public String myMarks(@RequestParam int marks){
        if (marks>75){
            return "distinction";
        }
        else {
            return "no distinction";
        }
    }

    @RequestMapping("/add2")
    public String addition2(@RequestParam int a,@RequestParam int b){
        return "addition is "+(a+b);
    }

    @RequestMapping("/subtract1")
    public String subtraction1(@RequestParam int a,@RequestParam int b){
        int c=a-b;
        return "subtraction is "+c;
    }
}
