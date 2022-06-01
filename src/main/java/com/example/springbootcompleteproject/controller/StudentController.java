package com.example.springbootcompleteproject.controller;

import com.example.springbootcompleteproject.model.Employee;
import com.example.springbootcompleteproject.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class StudentController {

    ArrayList<Student> studentArrayList=new ArrayList<>();

    //1. Create or Add

    @RequestMapping("/add_student")
    public String add(){
        Student student=new Student("Vinay",61,"PCB");
        studentArrayList.add(student);
        return "student added successfully";
    }

    //2. Read or Get

    @RequestMapping("/get_studentlist")
    public ArrayList<Student> getStudentArrayList(){
        return studentArrayList;
    }

    //3. Update

    @RequestMapping("/update_student")
    public String update(){
        studentArrayList.get(0).setName("Raghu");
        return "student updated successfully";

    }

    //4.Delete

    @RequestMapping("/delete_student")
    public String delete(){
        studentArrayList.remove(0);
        return "student deleted successfully";

    }

}
