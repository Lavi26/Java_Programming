package org.espire.squareroot;

/*
 * write a program to calculate the square root of a number without using the Math.sqrt() function 
 */
public class SquareRoot {
	// user-defined method that contains the logic to find the square root
	public static double square(double number) {
		// temporary variable
		double t;
		// Declare another variable to store the number/2 value

		double squareroot = number / 2;
//Use a do-while loop to calculate the square root		  
		do {
			t = squareroot;
			squareroot = (t + (number / t)) / 2;
		} while ((t - squareroot) != 0);
		// return the value.
		return squareroot;
	}

//main method		 
	public static void main(String[] args) {
		double number = 16;
		double root;
		root = square(number);
		System.out.println("Number : " + number);
		System.out.println("Square Root : " + root);
	}
}
