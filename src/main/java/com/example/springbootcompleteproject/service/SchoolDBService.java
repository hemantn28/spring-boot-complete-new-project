package com.example.springbootcompleteproject.service;

import com.example.springbootcompleteproject.model.School;
import com.example.springbootcompleteproject.repository.SchoolDBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class SchoolDBService {

    @Autowired
    SchoolDBRepository repository;

      public String add(School school){
        repository.save(school);
        return "school added to db";

    }

    public List<School> getAll(){
          return repository.findAll();
    }


    public String update(@RequestParam String name,@RequestParam Integer id){
          School school=repository.getById(id);
          school.setName("Oxford School");
          repository.save(school);
          return "school added to db";

    }

    public String delete(@RequestParam Integer id){
          repository.deleteById(id);
          return "school deleted in db";

    }



}
