package org.espire.fibonacci;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class FibonacciSeriesTest {

	@Test
	public void test() {
		
		assertNotNull(FibonacciSeries.checkFibonacci(7));
		assertNotNull(FibonacciSeries.checkFibonacci(5));
	}

}
