package com.student.implementation;

import java.time.LocalDate;
import java.util.Optional;

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
		student = setStudentEntity(student, studentRequest, "I");
		student = studentRepository.save(student);
		return setStudentResponse(student);
	}

	/**
	 * @param student
	 * @return
	 */
	public StudentResponse setStudentResponse(Student student) {
		StudentResponse studentResponse = new StudentResponse();
		studentResponse.setAge(student.getAge());
		studentResponse.setDate(student.getDate());
		studentResponse.setEmailId(student.getEmailId());
		studentResponse.setName(student.getName());
		return studentResponse;
	}

	public Student setStudentEntity(Student student, StudentRequest studentRequest, String statusCode) {
		if (statusCode.equals("I")) {
			student.setEmailId(studentRequest.getEmailId());
		} else {
			student.setEmailId(student.getEmailId());
		}
		student.setAge(studentRequest.getAge());
		student.setDate(LocalDate.now());
		student.setName(trimAndRemoveWhiteSpaceAndCapitalize(studentRequest.getName()));
		return student;
	}

	// Amit singh

	private static String trimAndRemoveWhiteSpaceAndCapitalize(String name) {
		name = name.trim();
		name = name.replaceAll("\\s+", " ");
		name = name.substring(0, 1).toUpperCase() + name.substring(1);
		return name;
	}

	@Override
	public StudentResponse updateStudent(String emailId, StudentRequest studentRequest) throws Exception {
		Optional<Student> findById = studentRepository.findById(emailId);
		Student student = null;
		if (findById.isPresent()) {
			student = setStudentEntity(findById.get(), studentRequest, "U");
			student = studentRepository.save(student);
		} else {
			throw new Exception(emailId + " does not exists. Please provide valid email id");
		}
		return setStudentResponse(student);
	}

}
