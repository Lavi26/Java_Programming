package org.espire.factorial;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckFactorial {

	@Test
	public void checkFactorial() {
		assertEquals(120, Factorial.checkFactorial(5));
		assertEquals(24, Factorial.checkFactorial(4));
	}

}
