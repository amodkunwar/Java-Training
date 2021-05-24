package com.example.demo;

// this. this()
//super. super()

public class ConstructorExample {
	public int num;
	
	public char c;
	
	public ConstructorExample() {
//		this(5);
//		num = 10;
//		System.out.println(num+" second");
		
	}
	
	public ConstructorExample(int num) {
		this.num = num;
		System.out.println("Hello");
	}
	
	public ConstructorExample(int num, int num1) {
		this();
		this.num = num;
	}
}
