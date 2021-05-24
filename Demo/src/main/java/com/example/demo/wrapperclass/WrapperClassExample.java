package com.example.demo.wrapperclass;

/*Primitive = Non Primitive(Wrapper class)
byte = Byte
int = Integer
String = String
boolean = Boolean
double = Double
float = Float
short = Short
long = Long
*/

/*Wrapper class supports these methods by default

comparTo()
max() |min()
toHexString()
toOctalString()
parseInt()*/

public class WrapperClassExample {

	public static void main(String[] args) {

		// Autobxing

		Integer y = 10; // Autoboxing -> converting primitive to non primitive is known as autoboxing
		System.out.println("non primitive " + y);

		// Unboxing - > converting non primitive to primitive is known as Unboxing

		int x = new Integer(y);
		int z = new Integer(5).intValue(); // internal functioning
		System.out.println("primitive " + x);

	}

}
