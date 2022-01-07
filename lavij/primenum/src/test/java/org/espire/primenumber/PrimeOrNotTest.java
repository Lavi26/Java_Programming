package org.espire.primenumber;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrimeOrNotTest {

	@Test
	public void test() {
		
		assertEquals(true,PrimeOrNot.checkPrime(5));

	}

	@Test
	public void test1() {

		assertEquals(true,PrimeOrNot.checkPrime(3));

	}

}
