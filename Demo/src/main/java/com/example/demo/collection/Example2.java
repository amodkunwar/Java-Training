package com.example.demo.collection;

public class Example2 {
	public static void main(String[] args) {
		String s1 = "Amit";
		String s2 = "Amit";

		if (s1.equals(s2)) {
			System.out.println("Hashcode is same " + " s1 : " + s1.hashCode() + " and s2 : " + s2.hashCode());
		}
		String s3 = "Amod";
		String s4 = "Kunwar";

		if (!s3.equals(s4)) {
			System.out.println("Hashcode is not same " + " s3 : " + s3.hashCode() + " and s4 : " + s4.hashCode());
		}

		Integer i = new Integer("123");
		int hashCode = i.hashCode();
		System.out.println("Int value hashcode " + hashCode);
		
//		Integer i2 = new Integer("abc");
//		int h2 = i2.hashCode();
//		System.out.println("Int value hashcode " + h2);

	}

}
