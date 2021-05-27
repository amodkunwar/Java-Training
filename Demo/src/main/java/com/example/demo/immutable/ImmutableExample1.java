package com.example.demo.immutable;

public final class ImmutableExample1 {

	final private String panCardNumber;

	public ImmutableExample1(String panCardNumber) {
		this.panCardNumber = panCardNumber;
	}

	public String getPanCard() {
		return this.panCardNumber;
	}

	public static void main(String[] args) {
		ImmutableExample1 example1 = new ImmutableExample1("12345");
		System.out.println("Example 1 : " + example1);

		ImmutableExample1 example2 = new ImmutableExample1("54321");
		System.out.println("Example 2 : " + example2);
	}

}
