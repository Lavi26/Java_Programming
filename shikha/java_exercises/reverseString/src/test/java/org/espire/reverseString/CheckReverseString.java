package org.espire.reverseString;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckReverseString {

	@Test
	public void testRevString() {
		assertEquals("avaj", ReverseString.reverse("java"));
	}

}
