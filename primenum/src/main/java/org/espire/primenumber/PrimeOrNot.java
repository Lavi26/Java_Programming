package org.espire.primenumber;

import java.util.Scanner;

public class PrimeOrNot {

	/*
	 * checking whether number is prime or not
	 */
	public static boolean checkPrime(int num) {

		int i, flag = 0;
		int m = num / 2;

		if (num <= 1) {
			return false;
		} 
		else {
			for (i = 2; i <= m; i++) {

				if (num % i == 0) {
					return false;
				}
			}
			return true;
		}
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();

		PrimeOrNot object = new PrimeOrNot();
		object.checkPrime(num);
		
		if(object.checkPrime(num)) {
			System.out.println("Number is Prime");
		}
		else {
			System.out.println("Number is Not Prime");
		}

	}

}
