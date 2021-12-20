package org.espire.deadlock;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestDeadlock {

	@Test
	public void testDeadlock() throws InterruptedException {
		SynchThread.deadlock();
	}

}

