package com.quickjava.springresth2.service;

import com.quickjava.springresth2.model.Student;
import com.quickjava.springresth2.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repository;

	public List<Student> findStudentsByLastName(String lastName) {
		return repository.findStudentsByLastName(lastName);
	}

}
