package com.example.demo.encapsulation;

public class Employee {
	
	//DTO, POJO, ENTITY

	private String name;
	private String employeeId;
	private double salary;
	private String number;
	private int age;
	private boolean isCurrentlyEmployed;

	public Employee() {
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	public Employee(String name) {
		super();
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeId() {
		return this.employeeId;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return this.salary;
	}

	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the isCurrentlyEmployed
	 */
	public boolean isCurrentlyEmployed() {
		return isCurrentlyEmployed;
	}

	/**
	 * @param isCurrentlyEmployed the isCurrentlyEmployed to set
	 */
	public void setCurrentlyEmployed(boolean isCurrentlyEmployed) {
		this.isCurrentlyEmployed = isCurrentlyEmployed;
	}

}
