package com.example.demo.interface1;

import java.io.Serializable;

public class School implements Student.Human, Student, Teacher, Serializable{

	@Override
	public void study() {

		System.out.println("Student studying" + Student.NAME);
	}

	@Override
	public void sleep() {
		System.out.println("Student love to sleep");
	}

	@Override
	public void teach() {
		System.out.println("Teacher is teaching");
	}

	@Override
	public void eat() {
		System.out.println("Human eat");
	}

}
