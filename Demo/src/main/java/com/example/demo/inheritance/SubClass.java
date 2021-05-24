package com.example.demo.inheritance;

public class SubClass extends SuperClass implements Animal, Mammel {

	/***
	 * @author Amit
	 * @param m
	 * @return String
	 * @throws Exception
	 */
	public String m2(String m) {
		System.out.println("sub class called");
		return m;
	}

	@Override // Run time polymorphism //JVM -> Machine -> Machine language -> .class
	public long m1(String s) {
		System.out.println("Sub class called");
		return 0;
	}

	// public
	// protected
	// default
	// private

	public static void main(String[] args) {
		SubClass subClass = new SubClass(); // Reference subclass and object -> subclass
		subClass.m1("s");
		subClass.m2("m2");

		SuperClass superClass = new SubClass(); // Refernce super class and object -> subclass
		superClass.m1("m1");

	}

}
