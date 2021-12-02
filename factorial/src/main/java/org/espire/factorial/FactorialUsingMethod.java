package org.espire.factorial;

import java.util.Scanner;

public class FactorialUsingMethod {

	/*
	 * Giving the Factorial of a number using method
	 */
	public static int factorial(int number) {

		if (number == 0) {
			return 1;
		} 
		else {
			// checking for each previous number
			return (number * factorial(number - 1));
		}

	}

	public static void main(String args[]) {

		System.out.println("Factorial is " + FactorialUsingMethod.factorial(5));

	}

}
