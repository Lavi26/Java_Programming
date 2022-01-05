package com.espire.fibonacci_series;

public class FibonacciSeries {
	/*
	 * Giving Fibonacci Series
	 */
	public static int checkFibonacci(int n) {

		int num1 = 0, num2 = 1;
		int count = 1;
		while (count <= n) {

			System.out.println("" + num1);

			// sum of previous two number
			int sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			count++;
		}
		return num1;

	}

	public static void main(String args[]) {

		FibonacciSeries.checkFibonacci(5);

	}

}
