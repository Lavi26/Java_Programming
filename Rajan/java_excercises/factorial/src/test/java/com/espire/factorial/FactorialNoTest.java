/**
 * 
 */
package com.espire.factorial;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author rajan.lahoti
 *
 */
public class FactorialNoTest {

	@Test
	public void test() {
		assertEquals(720,FactorialNo.findFactorial(6));
		assertEquals(5040,FactorialNo.findFactorial(7));
	}

}
