package com.collection.comparator;

import java.util.TreeSet;

public class Employee {
	String name;
	Integer age;

	public Employee() {
	}

	public Employee(String name, Integer age) {
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public static void main(String[] args) {
		TreeSet<Employee> treeSet = new TreeSet<>(new NameComparator());
		Employee emp1 = new Employee("Zunaid", 23);
		Employee emp2 = new Employee("Anu", 54);
		treeSet.add(emp1);
		treeSet.add(emp2);
		System.out.println("Sort by name");
		for (Employee employee : treeSet) {
			System.out.println(employee.getName() + " : " + employee.getAge());
		}

		TreeSet<Employee> treeSet1 = new TreeSet<>(new AgeComparator());
		Employee emp3 = new Employee("Zunaid", 23);
		Employee emp4 = new Employee("Anu", 54);
		treeSet1.add(emp3);
		treeSet1.add(emp4);
		System.out.println("Sort by Age");
		for (Employee employee : treeSet1) {
			System.out.println(employee.getName() + " : " + employee.getAge());
		}

	}

}
