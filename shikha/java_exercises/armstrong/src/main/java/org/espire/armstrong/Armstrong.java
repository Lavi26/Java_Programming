package org.espire.armstrong;

import java.util.Scanner;

public class Armstrong {
	
	/*
	   370 = 3^3 + 7^3 + 0^3
       27 + 343 + 0
       370
	 */

	public static String findArmstrong(int input) {
		int num = input;
		int sum = 0;
		int rem = 0;
		while (num > 0) {
			
			// sum of the cube of each digits
			rem = num % 10;
			sum = sum + (rem * rem * rem);
			num = num / 10;

		}
		if (input == sum) {
			return "Number is armstrong";
		} else {
			return "Number is not armstrong";
		}

	}

	// in main method taking input from scanner
	public static void main(String[] arg) {
		System.out.println("Enter a no.");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		String st = findArmstrong(input);
		System.out.println(st);
	}
	
}
