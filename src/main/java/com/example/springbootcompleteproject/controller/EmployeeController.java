package com.example.springbootcompleteproject.controller;

import com.example.springbootcompleteproject.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmployeeController {

    ArrayList<Employee> employeeArrayList=new ArrayList<>();

    //1.Create or Add

    @RequestMapping("/add_emp")
    public String add(){
        Employee employee=new Employee("Raj",87,"IT");
        employeeArrayList.add(employee);
        return "Employee added successfully";
    }
    //2.Read

    @RequestMapping("/get_emplist")
    public ArrayList<Employee> getEmployeeArrayList(){

        return employeeArrayList;
    }

    //3.Update

    @RequestMapping("/update_emp")
    public String update(){
        employeeArrayList.get(0).setName("Ramesh");
        return "employee name updated successfully";
    }
    //4.Delete

    @RequestMapping("/delete_emp")
    public  String delete(){
        employeeArrayList.remove(0);
        return "emp deleted successfully";
    }


}
