/**
 * 
 */
package com.espire.squareroot;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author rajan.lahoti
 *
 */
public class SquareRootTest {

	@Test
	public void test() {
		assertEquals(2.0, SquareRoot.findSquareRoot(4), 2.0);
		assertEquals(4.0, SquareRoot.findSquareRoot(16), 4.0);
	}

}
