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
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");

		int number = sc.nextInt();

		FactorialUsingMethod object = new FactorialUsingMethod();
		int fact = object.factorial(number);
		System.out.println("Factorial is " + fact);

	}

}
