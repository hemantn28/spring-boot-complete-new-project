package com.example.springbootcompleteproject.controller;

import com.example.springbootcompleteproject.model.Professor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ProfessorController {

    ArrayList<Professor> professorArrayList=new ArrayList<>();

    //1. Create or Add

    @RequestMapping("/add_prof")
    public String add(@RequestBody Professor professor){
        //Professor professor=new Professor("vinay Thakur", 53, "History");
        professorArrayList.add(professor);
        return "professor added successfully";
    }

    @RequestMapping("/get_proflist")
    public ArrayList<Professor> getProfessorArrayList(){
        return professorArrayList;
    }

    @RequestMapping("/update_prof")
    public String update(){
        professorArrayList.get(0).setAge(55);
        return "professor age added successfully";
    }


    @RequestMapping("/delete_prof")
    public String delete(){
        professorArrayList.remove(0);
        return "prof deleted successfully";
    }
}
