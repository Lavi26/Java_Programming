/**
 * 
 */
package com.espire.factorial;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author sahil.jamwal
 *
 */
public class FactorialTest {

	@Test
	public void test() {
		assertEquals(720,Factorial.findFactorial(6));
		assertEquals(5040,Factorial.findFactorial(7));
	}

}
