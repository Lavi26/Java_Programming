package org.espire.armstrong;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class ArmstrongTest {

	@Test
	public void test() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scanner.nextInt();
	    
		System.out.println("Enter the expected output: ");
		boolean expOutput = scanner.nextBoolean();
		
		Armstrong object = new Armstrong();
		boolean output = object.calculate(num);
		
		assertEquals(expOutput,output);
		
	}

}
