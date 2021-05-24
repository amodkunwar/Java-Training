package com.example.demo;

public class ValidateForVote extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	private int statusCode;

	ValidateForVote(String message) {
		super(message);
		this.message = message;
	}

	ValidateForVote(int statusCode) {
		this.statusCode = statusCode;
	}

	public ValidateForVote(String message, int statusCode) {
		this.message = message;
		this.statusCode = statusCode;
	}

}
