package com.example.demo.encapsulation;

import java.util.Scanner;

public class MainCclass {
	public static void main(String[] args) {
		Employee employee = new Employee();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter age");
		int age = scan.nextInt();
		employee.setAge(age);
		employee.setCurrentlyEmployed(true);
		employee.setEmployeeId("1");
		employee.setName("Amit");
		employee.setNumber("1221212121");
		employee.setSalary(656565);

		System.out.println(employee.getAge());
		System.out.println(employee.getSalary());
		System.out.println(employee.getEmployeeId());
		System.out.println(employee.getName());
		System.out.println(employee.getNumber());
		System.out.println(employee.getAge());

		scan.close();

	}
}
