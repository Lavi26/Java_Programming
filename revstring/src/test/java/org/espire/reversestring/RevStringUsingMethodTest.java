package org.espire.reversestring;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class RevStringUsingMethodTest {

	@Test
	public void test() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");

		String input = sc.nextLine();
        
		System.out.println("Enter expected output: ");
		String expOutput = sc.nextLine();
		
		RevStringUsingMethod obj = new RevStringUsingMethod();
		String output = obj.reverse(input);
		
		assertEquals(expOutput,output);

	}

}
