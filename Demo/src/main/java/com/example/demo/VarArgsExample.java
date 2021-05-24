package com.example.demo;

public class VarArgsExample {
	public static void main(String[] args) {
		argument(5, "Amit", "Amod", "Singh", "Kunwar");
	}

	private static void argument(int x, String... ss) {
		for (String string : ss) {
			System.out.println(string);
		}
	}
}
