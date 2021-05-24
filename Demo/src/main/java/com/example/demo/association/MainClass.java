package com.example.demo.association;

public class MainClass {
	public static void main(String[] args) {
		Student student = new Student();
//		student.name = "Amit";
//		student.address = new Address();
//		Address address = student.address;
//		student = null;
//		address.streetName = "BTM";
//		System.out.println("Student " + student); // null
//		System.out.println("Street " + address.streetName); //BTM

		student.name = "Amit";
		student.address.streetName = "Marathali";

		student = null;
		System.out.println("Student " + student); // null
		System.out.println(student.address.streetName); // null pointer

	}
}
