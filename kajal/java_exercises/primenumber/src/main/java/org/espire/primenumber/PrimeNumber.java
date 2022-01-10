package org.espire.primenumber;

/*
 * program to check if a given number is prime or not
 */
public class PrimeNumber {
	public static boolean prime(int x) {
		boolean flag = true; /// Assuming that input is Prime
		// Loop through all numbers between 1 and x
		for (int i = 2; i * i <= x; i++) {
			if (x % i == 0)
			/*
			 * If x is divisible by any number other than 1 and itself-then, it is Not Prime
			 */
			{
				flag = false;
				break; // Since the x is not prime, so no use of iterating further
			}
		}
		return flag;
	}

	public static void main(String args[]) {

		System.out.println(PrimeNumber.prime(5));
	}
}
