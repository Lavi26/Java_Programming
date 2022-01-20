package org.espire.deadlock;

import org.junit.Test;

public class TestDeadlock {

	@Test
	public void testDeadlock() throws InterruptedException {
		SynchThread.deadlock();
	}

}
