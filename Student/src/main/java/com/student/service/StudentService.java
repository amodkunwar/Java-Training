package com.student.service;

import com.student.model.StudentRequest;
import com.student.model.StudentResponse;

public interface StudentService {

	public StudentResponse saveStudent(StudentRequest studentRequest);

	public StudentResponse updateStudent(String emailId, StudentRequest studentRequest)throws Exception;
	
}
