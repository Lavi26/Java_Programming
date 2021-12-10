package org.espire.primenumber;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class PrimeOrNotTest {

	@Test
	public void test() {
		
		assertEquals(true,PrimeOrNot.checkPrime(5));
		assertEquals(true,PrimeOrNot.checkPrime(3));

	}

}
