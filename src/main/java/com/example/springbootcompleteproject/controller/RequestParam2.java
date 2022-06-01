package com.example.springbootcompleteproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParam2 {

    @RequestMapping("/my_name")
    public String typeName(@RequestParam String name){
        return "Welcome to request param "+name;
    }

    @RequestMapping("/my_city")
    public String typeCity(@RequestParam String city){
        return "Welcome to my "+city;
    }

    @RequestMapping("/check_salary")
    public String mySalary(@RequestParam int salary){
        return "my salary is this much "+salary;
    }

    @RequestMapping("/obtained_marks")
    public String check_marks(@RequestParam int marks){
        if (marks>85){
            return  "u r brilliant";
        }
        else if (marks>70){
            return "u r good student";
        }
        else if (marks>60){
            return "u r average student";
        }
        else {
            return "u r student";
        }
    }

    @RequestMapping("/product_price")
    public String checkPrice(@RequestParam int price){
        if (price>1000){
            return "product is costly";
        }
        else if (price>800){
            return "product is average";
        }
        else if (price>500){
            return "product is good";
        }
        else {
            return "product exists";
        }
    }
}
