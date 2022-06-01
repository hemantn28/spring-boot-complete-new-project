package com.example.springbootcompleteproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/hello")
    public void message(){

        System.out.println("Hello, welcome to spring boot..");
    }

    @RequestMapping("/message")
    public String hello(){

        return "This is my first spring boot app.";
    }

    @RequestMapping("/number")
    public int marks(){

        return 75;
    }

    @RequestMapping("/salary")
    public double mySalary(){

        return 85653.50;
    }

    @RequestMapping("/statement")
    public String sentence(){

        return "I am going to Agra";
    }

    @RequestMapping("/printInteger")
    public int makeInteger(){

        return 857649;
    }

    @RequestMapping("/sentence")
    public String makeSentence(){
        return "i am making a sentence";
    }

    @RequestMapping("/salary_know")
    public String knowSalary(){
        return "What is ur salary?";
    }
}
