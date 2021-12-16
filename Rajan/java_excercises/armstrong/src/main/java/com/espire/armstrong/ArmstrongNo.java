package com.espire.armstrong;

import java.util.Scanner;
//armstrong no.

/*
 153-1 5 3
 153-1^3+5^3+3^3
 153-153
 */

public class ArmstrongNo {
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
			return "No. is armstrong";
		} else {
			return "No. is not armstrong";
		}

	}

	// main method
	public static void main(String[] ag) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		String s = findArmstrong(input);
		System.out.println(s);
	}
}