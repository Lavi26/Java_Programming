package org.espire.squareroot;

import java.util.Scanner;

public class SquareRoot {

	/*
	 * Find the Square root of a number
	 */
	public static double checkRoot(int n) {

		double squareRoot, result;

		// approximate by half of the given number
		squareRoot = n / 2;

		// until the difference of approximate value and root value is not equal to 0
		do {
			result = squareRoot;
			squareRoot = (result + (n / result)) / 2;
		} while ((result - squareRoot) != 0);

		System.out.println("Square Root of the number is: " + squareRoot);
		return squareRoot;
		

	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");

		int num = sc.nextInt();
		
		checkRoot(num);

	}
}
