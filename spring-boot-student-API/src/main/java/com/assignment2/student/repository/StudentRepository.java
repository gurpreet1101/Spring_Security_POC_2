package com.assignment2.student.repository;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment2.student.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
