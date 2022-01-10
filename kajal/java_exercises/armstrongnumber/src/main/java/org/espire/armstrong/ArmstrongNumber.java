package org.espire.armstrong;

/*
 * a program to check if the given number is Armstrong number or not
 */
public class ArmstrongNumber {
<<<<<<< HEAD
=======

>>>>>>> 825caa0e5b94ed926fe7798db25d2269b6e26e2c
	// main method
	public static void main(String[] args) {
		int number = 153;
		if (isArmstrong(number)) {
			System.out.println(number + " is an Armstrong number!");
		} else {
			System.out.println(number + " is an NOT Armstrong number!");
		}
	}

	// function to check if the number is Armstrong or not
	public static boolean isArmstrong(int n) {
		int no_of_digits = String.valueOf(n).length();
		int sum = 0;
		int value = n;
		for (int i = 1; i <= no_of_digits; i++) {
			int digit = value % 10;
			value = value / 10;
			// calculates the power of a number up to digit times and add the resultant to
			// the sum variable
			sum = sum + (int) Math.pow(digit, no_of_digits);
		}
		// compares the sum with n
		if (sum == n) {
			// returns true if sum and n are equal
			return true;
		} else {
			// returns false if sum and n are not equal
			return false;
		}
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> 825caa0e5b94ed926fe7798db25d2269b6e26e2c
