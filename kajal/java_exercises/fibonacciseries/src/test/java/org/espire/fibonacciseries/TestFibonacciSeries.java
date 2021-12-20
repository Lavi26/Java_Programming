package org.espire.fibonacciseries;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFibonacciSeries {

	@Test
	public void test() {

		assertNotNull(FibonacciSeries.fibbonacci(5));
		assertNotNull(FibonacciSeries.fibbonacci(6));
	}
}
