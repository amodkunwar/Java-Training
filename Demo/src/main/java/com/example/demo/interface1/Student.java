package com.example.demo.interface1;

public interface Student {

//	public static final String NAME = "Amit";

	String NAME = "Amit";

	public abstract void study();

	public void sleep();

	// static
	// default

	static void running() {
		System.out.println("Student is running");
	}

	default void reading() {
		System.out.println("Student is reading");
	}
	
	interface Human {
		public void eat();
	}

}
