package com.example.springbootcompleteproject.repository;

import com.example.springbootcompleteproject.model.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolDBRepository extends JpaRepository<School, Integer> {
}
