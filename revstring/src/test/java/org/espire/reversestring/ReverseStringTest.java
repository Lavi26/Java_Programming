package org.espire.reversestring;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class ReverseStringTest {

	@Test
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");

		String input = sc.nextLine();
        
		System.out.println("Enter expected output: ");
		String expOutput = sc.nextLine();
		
		ReverseString obj = new ReverseString();
		String output= obj.checkString(input);
		
		assertEquals(expOutput,output);
	}

}
