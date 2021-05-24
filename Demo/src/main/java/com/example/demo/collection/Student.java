package com.example.demo.collection;

public class Student implements Comparable<Student> {
	String name;
	String id;
	Integer age;

	public Student() {
	}

	public Student(String name, String id, Integer age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public int compareTo(Student student) {
		return this.name.compareTo(student.name);
	}

	// 25 > 22 = +1
	// 22 < 25 = -1
	// 23 == 23 = 0

}
