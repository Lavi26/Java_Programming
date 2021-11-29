package org.espire.squareroot;

import static org.junit.Assert.*;

import java.util.Scanner;


import org.junit.Test;

public class SquareRootTest {

	@Test
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();

		System.out.println("Enter the expected output: ");
		double expOutput = sc.nextDouble();

		SquareRoot obj = new SquareRoot();
		double output= obj.checkRoot(num);
		
		assertEquals(expOutput,output);

	}

}
