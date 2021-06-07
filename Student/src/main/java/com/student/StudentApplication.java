package com.student;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("calling from run method");
		
	}

//	@Override
//	public void run(String... args) throws Exception {
//		System.out.println("calling from run method");
//
//	}

}

/***
 * 
 * Post - create - C * Get - fetch - R Put - edit - U Delete - delete - D
 * 
 */
