package com.espire.prime_number;

public class Prime_number {
	
	/*
	 * checking whether number is prime or not
	 */
	
	public static boolean isPrime(Integer number) {

		Integer i;

		if (number <= 1) {
			return false;
		} else {
			for (i = 2; i <= number / 2; i++) {

				if (number % i == 0) {
					return false;
				}
			}
			return true;
		}
	}

	public static void main(String args[]) {

		// Method calling and printing the output
		
		System.out.println(Prime_number.isPrime(5));

	}
}