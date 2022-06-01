package com.example.springbootcompleteproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @RequestMapping("/add")
    public String addition(){
        int a=6;
        int b=3;
        int c=a+b;
        return "addition is "+c;
    }

    @RequestMapping("/subtract")
    public String subtraction(){
        int a=45;
        int b=12;
        int c=a-b;
        return "subtraction is "+c;
    }

    @RequestMapping("/multiplication")
    public String multiply(){
        int a=2;
        int b=4;
        int c=a*b;
        return "multiplication is "+c;
    }

    @RequestMapping("/division")
    public String divide(){
        int a=25;
        int b=5;
        return "division is "+(a/b);
    }

    @RequestMapping("/addition")
    public int add(){
        int a=4;
        int b=4;
        int c=a+b;
        return  c;
    }

    @RequestMapping("/multiply")
    public int multiply1(){
        int a=55;
        int b=5;
        int c=a/b;
        return c;
    }

    @RequestMapping("/add_method")
    public String addition3(){
        int a=4;
        int b=56;
        int c=a+b;
        return "addition is "+c;
    }

    @RequestMapping("/minus_me")
    public int subtraction_method(){
        int a=89;
        int b=45;
        int c=a-b;
        return c;
    }

    @RequestMapping("/divide_me")
    public String divide_method(){
        int a=81;
        int b=9;
        int c=a/b;
        return "division is "+c;
    }
}
