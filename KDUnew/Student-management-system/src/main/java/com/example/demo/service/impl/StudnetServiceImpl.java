package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepository;
import com.example.demo.service.StudentService;

@Service
public abstract class StudnetServiceImpl implements StudentService{
	
	private StudentRepository studentRepository;

	public StudnetServiceImpl(StudentRepository studentRepository) {
		super();
	}

@Override
public List<Student>getAllStudents(){
	return studentRepository.findAll();
	}
}

