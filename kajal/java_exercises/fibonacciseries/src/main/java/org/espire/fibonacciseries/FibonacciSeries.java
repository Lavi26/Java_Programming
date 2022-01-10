package org.espire.fibonacciseries;

/*
 * Java program to print the Fibonacci series 
 * 
 *  @author Kajal
 */
public class FibonacciSeries {

	static int n1 = 0, n2 = 1, n3 = 1;

	static int fibbonacci(int count) {
		if (count > 0) {
			// the sum of the previous two numbers like fn = fn-1 + fn-2.
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			fibbonacci(count - 1);
		}
		return count++;
	}

	public static void main(String args[]) {
		FibonacciSeries.fibbonacci(5);
	}
}