package org.espire.squareroot;

import java.util.Scanner;

public class SquareRoot {
	public static double checkRoot(int n) {
		
		double squareRoot, result;
		squareRoot = n / 2;

		do {
			result = squareRoot;
			squareRoot = (result + (n / result)) / 2;
		} while ((result - squareRoot) != 0);
		
		System.out.println("Square Root of the number is: "+squareRoot);
		return n;
		
	}
	
}
