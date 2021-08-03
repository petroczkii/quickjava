package com.quickjava.springresth2.controller;

import com.quickjava.springresth2.model.Student;
import com.quickjava.springresth2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService service;

	@GetMapping("/findByLastName")
	public List<Student> findStudentsByLastName(@RequestParam String lastName) {
		return service.findStudentsByLastName(lastName);
	}

}
