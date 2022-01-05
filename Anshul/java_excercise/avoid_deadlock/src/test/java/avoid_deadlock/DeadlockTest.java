package avoid_deadlock;

import static org.junit.Assert.*;

import org.junit.Test;


public class DeadlockTest {
	@Test
	public void testAvoidDeadlock() throws InterruptedException {
		SynchroniseThread.avoidDeadlock();
	}

	}
