package com.example.demo.exception;

public class VoterVerificationException extends Exception{

	private static final long serialVersionUID = 1L;
	
//	private String message;
	
	public VoterVerificationException(String message) {
		super(message);
	}

}
