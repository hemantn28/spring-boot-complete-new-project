package com.example.springbootcompleteproject.controller;

import com.example.springbootcompleteproject.model.Student;
import com.example.springbootcompleteproject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentDBController {

    @Autowired
    StudentRepository repository;

    @RequestMapping(value = "add_student_db", method = RequestMethod.POST)
    public String add(@RequestBody Student student){
        repository.save(student);
        return "student added to db";
    }

    @RequestMapping(value = "get_student_db",method = RequestMethod.GET)
    public List<Student> getAll(){
        return repository.findAll();
    }

    @RequestMapping(value = "update_student_db/{name}", method = RequestMethod.PUT)
    public String update(@PathVariable String name, @RequestParam Integer id){
        Student student=repository.getById(id);
        student.setName("Saurabh Shukla");
        repository.save(student);
        return "student updated in db";
    }

    @RequestMapping(value = "delete_student_db", method = RequestMethod.DELETE)
    public String delete(@RequestParam Integer id){
        repository.deleteById(id);
        return "student deleted in db successfully";

    }
}
