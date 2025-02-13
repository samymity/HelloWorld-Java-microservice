package com.example.helloworld.test;

import java.util.ArrayList;
import java.util.List;

public class Factorial {

	int number;

	public Factorial(int number) {
		this.number = number;
	}

	public int findFactorial() {

		int result = 1;
		

		while (number > 0) // repeat
		{

			result = result * number;

			number = number - 1;
		}

		System.out.println(result);
		return result;
	}
}
