package com.example.springbootcompleteproject.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Path;

@RestController
public class PathVariableController {

    @RequestMapping("/msg/{name}")
    public String hello(@PathVariable String name) {

        return "Welcome to Path variable " + name;
    }

    @RequestMapping("/myage/{age}")
    public String checkAge(@PathVariable int age) {
        if (age > 18) {
            return "person is adult";
        } else {
            return "Person is child";
        }
    }

    @RequestMapping("/his_salary/{salary}")
    public String checkSalary(@PathVariable int salary) {
        if (salary > 50000) {
            return "salary is good";
        } else {
            return "salary is average";
        }

    }

    @RequestMapping("/addition/{a}/{b}")
    public String add(@PathVariable int a,@PathVariable int b){

        return "addition is "+(a+b);
    }

    @RequestMapping("/subtract/{a}/{b}")
    public String minus(@PathVariable int a, @PathVariable int b){

        return "subtraction is "+(a-b);
    }

    @RequestMapping("/division/{a}/{b}")
    public String divide(@PathVariable int a, @PathVariable int b){

        return "division is "+(a/b);
    }

    @RequestMapping("/multiply/{a}/{b}")
    public String multiply(@PathVariable int a, @PathVariable int b){

        return "multiply is "+(a*b);
    }

    @RequestMapping("/check_Age/{age}")
    public String checkAge1(@PathVariable int age){

        if (age>18){
            return "you are eligible for voting";
        }
        else {
            return "not eligible";
        }
    }

    @RequestMapping("/product/{price}")
    public String product(@PathVariable int price){
        if (price>1000){
            return "product is costly";
        }
        else {
            return "product is cheap";
        }
    }

    @RequestMapping("/home/{distance}")
    public String myHome(@PathVariable double distance){

        if (distance>15){
            return "your home is far";
        }
        else {
            return "your home is near";
        }
    }

    @RequestMapping("/add/{a}/{b}")
    public String addition(@PathVariable int a,@PathVariable int b){
        return "addition is "+(a+b);
    }

    @RequestMapping("/multiplication/{a}/{b}")
    public int multiply1(@PathVariable int a, @PathVariable int b){
        int c=a*b;
        return c;
    }

    @RequestMapping("/division1/{a}/{b}")
    public String divide1(@PathVariable int a, @PathVariable int b){
        int c=a/b;
        return "division is "+c;
    }

    @RequestMapping("/name_me/{name}")
    public String msg_me(@PathVariable String name){
        return "Welcome to my city "+name;
    }

    @RequestMapping("/my_city/{city}")
    public String type(@PathVariable String city){
        return "Welcome to "+city;
    }

    @RequestMapping("/prog/{software}")
    public String climb(@PathVariable String software){
        return "I am using "+software;
    }

    @RequestMapping("/division_method/{a}/{b}")
    public String divide_method(@PathVariable int a,@PathVariable int b){
        int c=a/b;
        return "division is "+c;
    }

    @RequestMapping("/minus_method/{a}/{b}")
    public String minus_me(@PathVariable int a,@PathVariable int b){
        int c=a-b;
        return "subtraction is "+c;
    }

    @RequestMapping("/my_number/{number}")
    public String checkNumber(@PathVariable int number){
        if (number>90){
            return "u r brilliant";
        }
        else {
            return "u r average student";
        }
    }

    @RequestMapping("/check_salary/{salary}")
    public String checkMySalary(@PathVariable int salary){
        if (salary>115000){
            return "ur package is high";
        }
        else {
            return "ur package is low";
        }
    }

 }



