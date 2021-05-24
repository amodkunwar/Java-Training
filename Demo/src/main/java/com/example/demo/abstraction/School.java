package com.example.demo.abstraction;

public abstract class School implements Student {

	public void attendance() {
		System.out.println("attendance");
	}

	public abstract void eat();
}
