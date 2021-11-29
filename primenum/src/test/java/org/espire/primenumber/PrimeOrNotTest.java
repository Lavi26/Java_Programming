package org.espire.primenumber;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class PrimeOrNotTest {

	@Test
	public void test() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();

		System.out.println("Enter the expected output: ");
		boolean expOutput = sc.nextBoolean();

		PrimeOrNot object = new PrimeOrNot();
		boolean output= object.checkPrime(num);
		
		assertEquals(expOutput,output);

	}

}
