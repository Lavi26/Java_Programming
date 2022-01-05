/**
 * 
 */
package com.espire.avoid_deadlock;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author rajan.lahoti
 *
 */
public class AvoidDeadlockTest {

	@Test
	public void testAvoidDeadlock() throws InterruptedException {
		SynchroniseThread.avoidDeadlock();
	}

}
