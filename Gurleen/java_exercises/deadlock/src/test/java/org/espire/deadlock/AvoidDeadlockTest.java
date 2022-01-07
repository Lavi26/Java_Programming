/**
 * 
 */
package org.espire.deadlock;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author gurleen.kaur
 *
 */
public class AvoidDeadlockTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAvoidDeadlock() throws InterruptedException {
		AvoidDeadlock ad = new AvoidDeadlock();
	    Thread S1 = new Thread(" Java ");
	    Thread S2 = new Thread(" JavaScript ");

	    S1.start();
	    S2.start();
	    
//	    S1.join();
//	    S2.join();
	}
}
