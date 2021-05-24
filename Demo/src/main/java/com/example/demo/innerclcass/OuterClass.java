package com.example.demo.innerclcass;

public class OuterClass {
	
	public static void m2() {
		System.out.println("M2");
	}

	static class InnerClass {
		public void print() {
			System.out.println("Inner class called.");
		}
	}

}
