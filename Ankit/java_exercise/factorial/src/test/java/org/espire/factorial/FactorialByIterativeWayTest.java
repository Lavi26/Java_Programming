/**
 * 
 */
package org.espire.factorial;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author ankit.jaisawal
 *
 */
public class FactorialByIterativeWayTest {

	/**
	 * Test method for {@link org.espire.factorial.FactorialByIterativeWay#factorial(int)}.
	 */
	@Test
	public void testFactorialByIterativeWay() {
		assertEquals(2, FactorialByIterativeWay.findFactorial(2));
		assertEquals(120, FactorialByIterativeWay.findFactorial(5));
		assertEquals(1, FactorialByIterativeWay.findFactorial(0));
	}
	
	/**
	 * Test method for {@link org.espire.factorial.FactorialByRecursiveWay#factorial(int)}.
	 */
	@Test
	public void testFactorialByRecursiveWay() {
		assertEquals(2, FactorialByRecursiveWay.findFactorial(2));
		assertEquals(120, FactorialByRecursiveWay.findFactorial(5));
		assertEquals(1, FactorialByRecursiveWay.findFactorial(0));
	}

}
