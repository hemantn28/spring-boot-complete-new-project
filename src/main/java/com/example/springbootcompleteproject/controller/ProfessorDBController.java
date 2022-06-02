package com.example.springbootcompleteproject.controller;

import com.example.springbootcompleteproject.model.Professor;
import com.example.springbootcompleteproject.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProfessorDBController {

    //create
    @Autowired
    ProfessorRepository repository;

    @RequestMapping(value = "add_prof_db", method = RequestMethod.POST)
    public String add(@RequestBody Professor professor){
        repository.save(professor);
        return "prof added to DB successfulyy";
    }

    //Get

    @RequestMapping(value = "get_prof_db", method = RequestMethod.GET)
    public List<Professor> getAll(){
        return  repository.findAll();
    }
    //Update

    @RequestMapping(value = "update_prof_db", method = RequestMethod.PUT)
    public String update(@RequestParam String name, @RequestParam Integer id){
       Professor professor=repository.getById(id);
       professor.setName("Ram Avtar");
       repository.save(professor);
        return "prof updated in db";
    }

    //delete

    @RequestMapping(value = "delete_prof_db", method = RequestMethod.DELETE)
    public String delete(@RequestParam Integer id){
        repository.deleteById(id);
        return "professor deleted successfully";
    }

}
