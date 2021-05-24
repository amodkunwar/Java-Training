package com.example.demo;

public class Employee {

	// instance variable
	String food;

	// static variable
	public static String grains;

	public void eat() {
		final String food = "bread";
		System.out.println(food);
	}

	public static void main(String[] args) {
		Employee employee = new Employee();
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		Employee employee3 = new Employee();
		employee.eat();
	}
	
	public Employee(String grainsdsasdasd) {
		this.grains = grainsdsasdasd;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
}

class Employer {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.food = "rice";
		Employee.grains="sadsasd";
	}

}

/***
 * 1. Class is a blueprint/mastercopy 2. We used to declare class by using class
 * keyword 3. Outer class should be public/ default 4. Outer class shoudn't be
 * private and protected. 5. Class contains : a. Constructor b. Methods c.
 * Variables etc 6. Class is a user defined/ custome data type.
 * 
 * Object 1. Object is a real world entity. 2. We need new keyword to create an
 * object
 * 
 * 
 * 
 * 
 * 
 * 
 */
