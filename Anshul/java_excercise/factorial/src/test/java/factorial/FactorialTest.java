package factorial;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class FactorialTest {

	@Test
	public void factorialNumberTest() {
        
		assertEquals(120,Factorial.checkFact(5));
		assertEquals(5040,Factorial.checkFact(7));
	}
	


}
