package org.espire.reversestring;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class ReverseStringTest {

	@Test
	public void reverseStringTest() {
		
		String str="abc";
		
		ReverseString obj = new ReverseString();
		String output= obj.checkString(str);
		
		assertEquals("cba",output);
	}
	
	@Test
	public void reverseStringMethodTest() {
		
		String str="abc";
		
		RevStringUsingMethod obj = new RevStringUsingMethod();
		String output= obj.reverse(str);
		
		assertEquals("cba",output);
	}

}
