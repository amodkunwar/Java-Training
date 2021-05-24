package com.example.demo.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorExampleJava8 {

	 public static void main(String[] args) 
	    {
	        ArrayList<Employee> employees = getUnsortedEmployeeList();
	         
	        //Compare by first name and then last name
	        Comparator<Employee> compareByName = Comparator
	                                                .comparing(Employee::getFirstName)
	                                                .thenComparing(Employee::getLastName);
	         
	        Collections.sort(employees, compareByName);
	         
	        System.out.println(employees);
	    }
	 
	    private static ArrayList<Employee> getUnsortedEmployeeList() 
	    {
	        ArrayList<Employee> list = new ArrayList<>();
	        list.add( new Employee(2, "Lokesh", "Gupta") );
	        list.add( new Employee(1, "Alex", "Gussin") );
	        list.add( new Employee(4, "Brian", "Sux") );
	        list.add( new Employee(5, "Neon", "Piper") );
	        list.add( new Employee(3, "David", "Beckham") );
	        list.add( new Employee(7, "Alex", "Beckham") );
	        list.add( new Employee(6, "Brian", "Suxena") );
	        return list;
	    }
	
}
