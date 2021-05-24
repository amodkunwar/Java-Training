package com.example.demo;

import java.util.Scanner;

public class ExceptionMainRunner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = scan.nextInt();
		try {
			validateAge(age);
		} catch (ValidateForVote e) {
			System.out.println("Exception occured ");
			e.printStackTrace();
		}
		scan.close();
	}

	private static void validateAge(int age) throws ValidateForVote {
		if (age < 18) {
			throw new ValidateForVote("You are not eligible to vote");
		} else {
			System.out.println("Welcome to voting world");
		}

	}
}
