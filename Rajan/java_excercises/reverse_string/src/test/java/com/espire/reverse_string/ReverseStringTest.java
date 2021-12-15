/**
 * 
 */
package com.espire.reverse_string;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author rajan.lahoti
 *
 */
public class ReverseStringTest {

	@Test
	public void testReverseString() {
		assertEquals("najar",ReverseString.reverse("rajan"));
	}

}
