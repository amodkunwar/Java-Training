package com.student.implementation;

import org.springframework.stereotype.Service;

import com.student.service.HelloWorld;

@Service
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String hello() {
		return "Hello from Serive";
	}

}

/***
 * OK - 200
 * Not found - 404
 * forbidden - 403
 * unauthorised - 401
 * intrnal server error - 500
 * Bad request = 400
 * 
 * 
 */
