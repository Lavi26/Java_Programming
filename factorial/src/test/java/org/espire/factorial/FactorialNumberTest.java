package org.espire.factorial;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class FactorialNumberTest {

	@Test
	public void factorialNumberTest() {
		int num = 4;

		FactorialNumber obj = new FactorialNumber();
		int output = obj.checkFact(num);
        
		assertEquals(24,output);
	}
	
	@Test
	public void factorialMethodTest() {
		int num = 4;

		FactorialUsingMethod obj = new FactorialUsingMethod();
		int output = obj.factorial(num);
        
		assertEquals(24,output);
	}


}
