package com.example.demo.repo;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.example.demo.entity.Student;

public interface StudentRepository extends JpaRepositoryImplementation<Student, Long>
{}

