package org.espire.factorial;

import java.util.Scanner;

public class FactorialNumber {

	/*
	 * find the factorial of a number
	 */
	public static int checkFact(int n) {
		
		int i, fact = 1;

		if (n == 0) {
			return 1;
		}
		else {			
			for (i = 1; i <= n; i++) {
				fact = fact * i;
			}
		}
		System.out.println(+fact);
		return fact;

	}

	public static void main(String args[]) {
		
		int num = 5;

		FactorialNumber.checkFact(num);

	}

}
