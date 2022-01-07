package squareroot;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareRootTest {
	@Test
	public void testCheckRoot1() {
		assertEquals(1.7320508075688772, SquareRootOfNumber.squareRoot(3), 1.7320508075688772);
	}
	@Test
	public void testCheckRoot2() {
		assertEquals(1.41421356, SquareRootOfNumber.squareRoot(2),1.41421356);
	}

}
