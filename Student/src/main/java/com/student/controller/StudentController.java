package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.StudentRequest;
import com.student.model.StudentResponse;
import com.student.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping(value = "student/create")
	public @ResponseBody StudentResponse saveCreate(@RequestBody StudentRequest studentRequest) {
		return studentService.saveStudent(studentRequest);
	}

}
