package com.example.springbootcompleteproject.repository;

import com.example.springbootcompleteproject.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor,Integer> {

}
