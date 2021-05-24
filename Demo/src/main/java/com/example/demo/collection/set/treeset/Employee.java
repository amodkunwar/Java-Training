package com.example.demo.collection.set.treeset;

import java.util.Set;
import java.util.TreeSet;

public class Employee {

	String name;
	int age;

	public Employee() {
	}

	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		Employee emp1 = new Employee("Junaid", 23);
		Employee emp2 = new Employee("Amod", 45);
		Set<Employee> treeSet = new TreeSet<>(new NameComparator());
		treeSet.add(emp1);
		treeSet.add(emp2);
		System.out.println("Sort by name");
		for (Employee employee : treeSet) {
			System.out.println(employee.getName() + " : " + employee.getAge());
		}
	}

}
