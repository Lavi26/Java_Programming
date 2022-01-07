package fibonacci;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {

	@Test
	public void test() {
		
		assertNotNull(FibonacciSeries.checkFibonacci(9));
		assertNotNull(FibonacciSeries.checkFibonacci(3));
	}
}
