package com.example.demo.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		List<Student> lst = new ArrayList<>();
		Student student1 = new Student("Kunwar", "1", 54);
		Student student2 = new Student("Singh", "2", 32);
		Student student3 = new Student("Zmod", "3", 43);
		Student student5 = new Student("Gnu", "4", 12);
		Student student4 = new Student("Amit", "4", 12);
		lst.add(student1);
		lst.add(student2);
		lst.add(student3);
		lst.add(student5);
		lst.add(student4);
		Collections.sort(lst);
		for (Student student : lst) {
			System.out.println(student.name + " : " + student.age);
		}
	}
}
