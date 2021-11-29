package org.espire.factorial;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class FactorialUsingMethodTest {

	@Test
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");

		int number = sc.nextInt();

		FactorialUsingMethod object = new FactorialUsingMethod();
		int fact = object.factorial(number);
		System.out.println("Factorial is " + fact);
	}

}
