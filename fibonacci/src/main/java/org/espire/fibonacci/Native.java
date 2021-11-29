package org.espire.fibonacci;

import java.util.Scanner;

public class Native {

	/*
	 * Giving Fibonacci Series
	 */
	public static int checkFibonacci(int count) {
		int i = 1;
		int num1 = 1, num2 = 1;
		while (i <= count) {
			System.out.println(num1 + "");
			int sum = num1 + num2; // sum of prev two num
			num1 = num2;
			num2 = sum;
			i++;
		}
		return num2;

	}

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int count1 = scanner.nextInt();
		System.out.println("Fibonacci series is:");

		Native obj = new Native();
		obj.checkFibonacci(count1);

	}

}
