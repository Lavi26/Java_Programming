package com.programming;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		
		int num1 = 1, num2 = 1, count;
		count = scanner.nextInt();

		System.out.println("Fibonacci series is:");

		int i=1;
		while (i<= count) {
			System.out.println(num1 + "");
			int sum = num1 + num2;                  //sum of prev two num
			num1 = num2;
			num2 = sum;
			i++;

		}

	}

}
