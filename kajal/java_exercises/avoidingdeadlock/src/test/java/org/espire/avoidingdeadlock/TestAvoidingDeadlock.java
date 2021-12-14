package org.espire.avoidingdeadlock;

import static org.junit.Assert.*;

import java.util.concurrent.BrokenBarrierException;
import org.junit.Test;

public class TestAvoidingDeadlock {

	 @Test
	    void callingBothMethodsWillDeadlock() {
	        var deadlock = new Avoidingdeadlock(Integer.class, String.class);

	        Thread t1 = new Thread(() -> {
	        	  try {
	        	        deadlock.method1(); 
	        	    } catch (BrokenBarrierException | InterruptedException e) {
	        	        e.printStackTrace();
	        	    }
	        });
	        t1.start();

	        Thread t2 = new Thread(() -> {
	        	 try {
	        	        deadlock.method2();
	        	    } catch (BrokenBarrierException | InterruptedException e) {
	        	        e.printStackTrace();
	        	    }
	           
	        });
	        t2.start();

	        Avoidingdeadlock.tryToSleep(5000); // We need to wait for 2s + 2s + some more to be sure...

	        assertEquals(Thread.State.BLOCKED, t1.getState());
	        assertTrue(t1.isAlive());

	        assertEquals(Thread.State.BLOCKED, t2.getState());
	        assertTrue(t2.isAlive());}}

