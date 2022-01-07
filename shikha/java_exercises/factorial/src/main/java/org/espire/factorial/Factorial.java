package org.espire.factorial;

import java.util.Scanner;

public class Factorial {
	public static int checkFactorial(int number) {
		// declaring a variable
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		return fact;

	}

//main method
	public static void main(String[] ag) {
		System.out.println("Enter any no.");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println(checkFactorial(input));
	}

}
