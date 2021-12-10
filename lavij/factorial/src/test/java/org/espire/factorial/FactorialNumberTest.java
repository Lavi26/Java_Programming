package org.espire.factorial;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class FactorialNumberTest {

	@Test
	public void factorialNumberTest() {
        
		assertEquals(120,FactorialNumber.checkFact(5));
		assertEquals(5040,FactorialNumber.checkFact(7));
	}
	
	@Test
	public void factorialMethodTest() {
        
		assertEquals(120,FactorialUsingMethod.factorial(5));
		assertEquals(5040,FactorialUsingMethod.factorial(7));
	}


}
