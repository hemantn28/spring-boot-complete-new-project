package com.example.springbootcompleteproject.controller;

import com.example.springbootcompleteproject.model.School;
import com.example.springbootcompleteproject.service.SchoolDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SchoolDBController {

    @Autowired
    SchoolDBService service;

    @RequestMapping(value = "add_sch_db", method = RequestMethod.POST)
    public String add(@RequestBody School school){
        return service.add(school);

    }

    @RequestMapping(value = "get_sch_db", method = RequestMethod.GET)
    public List<School> getAll(){
        return service.getAll();
    }

    @RequestMapping(value = "update_sch_db", method = RequestMethod.PUT)
    public String update(@RequestParam String name,@RequestParam Integer id){
        service.update("Oxford School",20);
        return "school added to db successfully";

    }

    @RequestMapping(value = "delete_school_db", method = RequestMethod.DELETE)
    public String delete(@RequestParam Integer id){
        service.delete(18);
        return "school deleted in db";

    }
}
