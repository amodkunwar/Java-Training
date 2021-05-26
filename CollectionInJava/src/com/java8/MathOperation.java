package com.java8;


@FunctionalInterface
public interface MathOperation {

	int operation(int a, int b);

	default void print() {
		System.out.println("I am a vehicle!");
	}
	
	static void m1() {
		System.out.println("Static");
	}
	
//	int operation1(int a, int b);

}
