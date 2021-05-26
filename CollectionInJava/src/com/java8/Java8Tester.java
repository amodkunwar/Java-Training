package com.java8;

public class Java8Tester {
	public static void main(String[] args) {
		Java8Tester tester = new Java8Tester();

		MathOperation mathOperation1 = new MathOperation() {

			@Override
			public int operation(int a, int b) {
				return a + b;
			}
		};

		System.out.println(tester.operate(10, 5, mathOperation1));
		
		
		MathOperation mathOperation2 = (int a, int b) -> {return a+b;};
		System.out.println("Addition "+tester.operate(10, 5, mathOperation2));
		
		MathOperation mathOperation3 = (a,b) -> {return a-b;};
		System.out.println("Subtraction "+tester.operate(10, 5, mathOperation3));
		
		MathOperation mathOperation4 = (a, b) -> a / b;
		System.out.println("Division "+tester.operate(10, 5, mathOperation4));
		
		MathOperation mathOperation5 = (int a, int b)-> a*b;
		System.out.println("Multiplication "+tester.operate(10, 5, mathOperation5));
		
		GreetingService greetingService = (String message) -> {return "Hello";};
		System.out.println(tester.print("Hello", greetingService));
		
	}

	private int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}
	
	private String print(String message, GreetingService greetingService) {
		return greetingService.sayMessage(message);
	}
}
