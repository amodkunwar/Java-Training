package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.student.service.HelloWorld;

@Controller
public class HelloWorldController {
	
//	HelloWorldImpl helloWorldImpl = new HelloWorldImpl();// tight coupling.
	
	@Autowired
	HelloWorld helloWorld; // loose coupling
	
	@GetMapping(value = "/hello")
	public @ResponseBody String helloWorld() {
		return helloWorld.hello();
	}

}
