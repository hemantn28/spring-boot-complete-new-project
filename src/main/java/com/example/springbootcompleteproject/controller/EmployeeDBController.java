package com.example.springbootcompleteproject.controller;

import com.example.springbootcompleteproject.model.Employee;
import com.example.springbootcompleteproject.model.Professor;
import com.example.springbootcompleteproject.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeDBController {

    @Autowired
    EmployeeRepository repository;

    @RequestMapping(value = "add_emp_db", method = RequestMethod.POST)
    public String add(@RequestBody Employee employee){
        repository.save(employee);
        return "emp added to db";
    }

    @RequestMapping(value = "get_emp_db", method = RequestMethod.GET)
    public List<Employee> getAll(){
        return repository.findAll();
    }

    @RequestMapping(value = "update_emp_db", method = RequestMethod.PUT)
    public String update(@RequestParam Integer age,@RequestParam Integer id){
        Employee employee=repository.getById(id);
        employee.setAge(45);
        repository.save(employee);
        return "employee updated in db";

    }

    @RequestMapping(value = "delete_emp_db/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable Integer id){
        repository.deleteById(id);
        return "emp deleted successfully";

    }
}
