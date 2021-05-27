package com.example.demo.immutable;

public final class ImmutableExample1 {

	final private String panCardNumber;

	public ImmutableExample1(String panCardNumber) {
		this.panCardNumber = panCardNumber;
	}

	public String getPan() {
		return this.panCardNumber;
	}
	
	public static void main(String[] args) {
		ImmutableExample1 example1 = new ImmutableExample1("12345");
		System.out.println(example1.getPan());
	}

}
