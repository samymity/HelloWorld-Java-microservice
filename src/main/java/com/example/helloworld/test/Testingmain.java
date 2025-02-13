package com.example.helloworld.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Testingmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Factorial f = new Factorial(5); // progrmming  usign variables
		//f.findFactorial();
		
		MergeSortedArray m = new MergeSortedArray();
		m.sort(m.getFirstarray());
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
		names.stream().filter(name -> name.startsWith("A")).forEach(System.out::println);
		
		
		 List<String> names1 = Arrays.asList("Alice", "Bob", "Charlie");
		 System.out.println(names1);
	        // Using a lambda expression
	        names1.forEach(name -> System.out.println(name));
		
		
		
		}
	
	
	
	
		
	

}
