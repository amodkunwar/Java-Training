package com.example.demo;

public class Student {

	private String name;
	private String place;

	public Student() {
	}

	public Student(String name, String place) {
		super();
		this.name = name;
		this.place = place;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", place=" + place + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

}
