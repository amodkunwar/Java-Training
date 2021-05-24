package com.example.demo.collection.set;

import java.util.HashSet;
import java.util.Set;

public class MainClass {
	public static void main(String[] args) {
		Set<Employee> set = new HashSet<>();
		Employee employee = new Employee("Amod", 24);
		Employee employee1 = new Employee("Amit", 23);
		Employee employee3 = new Employee("Amit", 23);
		set.add(employee);
		set.add(employee1);
		set.add(employee3);
		for (Employee employee2 : set) {
			System.out.println(employee2.getName() + " " + employee2.getAge());
		}

	}
}
