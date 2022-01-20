package org.espire.string;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestReverseString {

	@Test
	public void reverseStringTest() {

		assertEquals("cba", ReverseString.reverseString("abc"));
		assertEquals("", ReverseString.reverseString(""));
		assertNotEquals("abc", ReverseString.reverseString("abc"));

	}

	@Test
	public void reverseStringUsingMethodTest() {
		assertEquals("raj", ReverseStringUsingMethod.reverse("jar"));
		assertEquals("", ReverseStringUsingMethod.reverse(""));
		assertNotEquals("abc", ReverseStringUsingMethod.reverse("abc"));

	}
}
