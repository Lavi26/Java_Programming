/**
 * 
 */
package com.espire.fibonacci;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author sahil.jamwal
 *
 */
public class FibonacciTest {

	@Test
	public void test() {
		assertNotNull(Fibonacci.checkFibonacci(5));
	}

}
