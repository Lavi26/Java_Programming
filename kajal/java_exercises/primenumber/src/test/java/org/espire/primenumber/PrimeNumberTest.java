package org.espire.primenumber;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeNumberTest {

	@Test
	public void testPrimeNumber() {

		// assertTrue("Result",PrimeNumber.prime(5));
		assertEquals(false, PrimeNumber.prime(5));
	}
}
