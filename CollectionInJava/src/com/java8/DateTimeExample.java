package com.java8;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DateTimeExample {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate.plusDays(10));
		
		Instant instant = Instant.now();
		System.out.println(instant);
		
//		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("YYYY-mm-dd");
//		String format = dateTimeFormatter.format(instant);
//		System.out.println(format);
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		
		
//		1. Lambda Expression
//		2. Method Reference
//		3. Stream
//		4. DateTime
//		5. Funtional Interface
//		6. Default method
	}
}
