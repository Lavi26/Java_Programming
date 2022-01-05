package com.espire.prime_number;

import static org.junit.Assert.*;

import org.junit.Test;

public class Prime_numberTest {

	
	@Test
	public void testIsPrime1() {
		assertEquals(true, Prime_number.isPrime(5));
	}

	@Test
	public void testIsPrime2() {
		assertEquals(false, Prime_number.isPrime(4));
	}

}