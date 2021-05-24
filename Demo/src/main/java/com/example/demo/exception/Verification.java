package com.example.demo.exception;

import java.util.Scanner;

public class Verification {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = scan.nextInt();
		try {
			verifyAge(age);
		} catch (VoterVerificationException e) {
			e.printStackTrace();
		}
		scan.close();
	}

	private static void verifyAge(int age) throws VoterVerificationException {
		if (age < 18) {
			throw new VoterVerificationException("You are not qualified for voting");
		} else {
			System.out.println("Welcome to the voting world");
		}
		
		String name = "Amod";
		String name1 = "Amit";
		String friend = name.concat(name1);

		// AmodAmit

	}

}
