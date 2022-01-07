package org.espire.deadlock;

import org.junit.Test;

public class TestDeadLock {

	@Test
	public void testDeadLock() throws InterruptedException {
		SynchThread.deadlock();
	}

}
