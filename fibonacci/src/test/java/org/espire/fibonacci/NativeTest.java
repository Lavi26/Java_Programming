package org.espire.fibonacci;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class NativeTest {

	@Test
	public void test() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int count1 = scanner.nextInt();
		System.out.println("Fibonacci series is:");

		Native obj = new Native();
		int output= obj.checkFibonacci(count1);
		
	}

}
