package org.espire.factorial;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class FactorialNumberTest {

	@Test
	public void test() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		System.out.println("Factorial of number is: ");

		FactorialNumber obj = new FactorialNumber();
		obj.checkFact(num);

	}

}
