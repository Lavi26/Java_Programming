package org.espire.reversestring;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseStringTest {

	@Test
	public void reverseStringTest() {
		
		assertEquals("cba",ReverseString.checkString("abc"));

	}

	@Test
	public void reverseStringTest1() {

		assertEquals("edcba",ReverseString.checkString("abcde"));
	}
	
	@Test
	public void reverseStringMethodTest() {
		
		assertEquals("zyx",RevStringUsingMethod.reverse("xyz"));
	}

}
