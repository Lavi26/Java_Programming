package com.espire.squareroot;

import java.util.Scanner;

/**
 * @author rajan.lahoti
 *
 */
public class SquareRoot {
	// method for finding square root
	public static double findSquareRoot(int n) {

		double root, result;

		root = n / 2;

		do {
			result = root;
			root = (result + (n / result)) / 2;
		} while ((result - root) != 0);

		return root;

	}
//main method
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		double s = findSquareRoot(input);
		System.out.println(s);

	}
}