package com.example.demo.innerclcass;

public class MainClass {
	public static void main(String[] args) {
		OuterClass.m2();

		OuterClass.InnerClass outer = new OuterClass.InnerClass();
		outer.print();
	}

}
