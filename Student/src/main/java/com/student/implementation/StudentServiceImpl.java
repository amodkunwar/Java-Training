package com.student.implementation;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.model.StudentRequest;
import com.student.model.StudentResponse;
import com.student.repository.StudentRepository;
import com.student.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public StudentResponse saveStudent(StudentRequest studentRequest) {
		Student student = new Student();
		student.setAge(studentRequest.getAge());
		student.setDate(LocalDate.now());
		student.setEmailId(studentRequest.getEmailId());
		student.setName(studentRequest.getName());
		student = studentRepository.save(student);
		StudentResponse studentResponse = new StudentResponse();
		studentResponse.setAge(student.getAge());
		studentResponse.setDate(student.getDate());
		studentResponse.setEmailId(student.getEmailId());
		studentResponse.setName(student.getName());
		return studentResponse;
	}

}
