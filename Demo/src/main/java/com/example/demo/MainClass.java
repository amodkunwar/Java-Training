package com.example.demo;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		int a = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int length = scan.nextInt();
		int[] arr = new int[length];
		for (int i = 0; i < length; i++) {
			System.out.println("Enter element " + a);
			int val = scan.nextInt();
			arr[i] = val;
			a++;
		}
		System.out.println("Array");
		for (int i : arr) {
			System.out.print(i + " ");
		}

		scan.close();
	}

}
