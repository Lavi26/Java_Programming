package org.espire.reversestring;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class ReverseStringTest {

	@Test
	public void reverseStringTest() {
		
		assertEquals("cba",ReverseString.checkString("abc"));
		assertEquals("edcba",ReverseString.checkString("abcde"));
	}
	
	@Test
	public void reverseStringMethodTest() {
		
		assertEquals("zyx",RevStringUsingMethod.reverse("xyz"));
	}

}
