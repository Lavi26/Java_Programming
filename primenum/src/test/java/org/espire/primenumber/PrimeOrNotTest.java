package org.espire.primenumber;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class PrimeOrNotTest {

	@Test
	public void test() {
		
		int num = 3;

		PrimeOrNot object = new PrimeOrNot();
		boolean output= object.checkPrime(num);
		
		assertEquals(true,output);

	}

}
