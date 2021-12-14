package org.espire.factorial;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFactorial {

	@Test
	public void test() {

	   
	        assertTrue(Factorial.factIterative(0) == 1);
	        assertTrue(Factorial.factIterative(1) == 1);
	        assertTrue(Factorial.factRecursive(5) == 120);
	    }
}

