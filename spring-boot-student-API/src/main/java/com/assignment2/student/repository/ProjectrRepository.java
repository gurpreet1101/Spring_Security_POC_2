package com.assignment2.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment2.student.entity.Project;

@Repository
public interface ProjectrRepository extends JpaRepository<Project, Long>{

}
