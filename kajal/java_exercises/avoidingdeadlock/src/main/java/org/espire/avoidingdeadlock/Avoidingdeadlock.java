package org.espire.avoidingdeadlock;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Avoidingdeadlock {
	 final private CyclicBarrier cyclicBarrier = new CyclicBarrier(2);
	    final private Object resource1;
	    final private Object resource2;

	    public Avoidingdeadlock(Object resource1, Object resource2) {
	        this.resource1 = resource1;
	        this.resource2 = resource2;
	    }

	    public void method1() throws BrokenBarrierException, InterruptedException {
	        synchronized (resource1) {
	            cyclicBarrier.await();
	            synchronized (resource2) {
	            }
	        }
	    }

	    public void method2() throws BrokenBarrierException, InterruptedException {
	        synchronized (resource2) {
	            cyclicBarrier.await();
	            synchronized (resource1) {
	            }
	        }
	    }

	    public static void tryToSleep(long millis) {
	        try {
	            Thread.sleep(millis);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	        public static void main(String args[]) {
	Avoidingdeadlock.tryToSleep(5000);
}
	    }
	