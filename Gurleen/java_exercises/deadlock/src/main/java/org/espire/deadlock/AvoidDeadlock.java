/**
 * 
 */
package org.espire.deadlock;

/**
 * @author gurleen.kaur
 *
 */
public class AvoidDeadlock {
	
//	public static void toAvoidDeadlock(String[] args) {
//	    final String resource1 = "Java ";
//	    final String resource2 = "Spring Tool Suite";
//	    Thread t1 = new Thread() {
//	      public void run() {
//	        synchronized(resource1) {
//	          System.out.println("Thread 1: Locked resource1");
//	          try {
//	            Thread.sleep(100);
//	          }
//	          catch(Exception e) {}
//	          synchronized(resource2) {
//	            System.out.println("Thread 1: Locked resource2");
//	          }
//	        }
//	      }
//	    };
//	    Thread t2 = new Thread() {
//	      public void run() {
//	        synchronized(resource1) {
//	          System.out.println("Thread 2: Locked resource1");
//	          try {
//	            Thread.sleep(100);
//	          } catch(Exception e) {}
//	          synchronized(resource2) {
//	            System.out.println("Thread 2: Locked resource2");
//	          }
//	        }
//	      }
//	    };
//	    t1.start();
//	    t2.start();
//	  }
	
	   public static void toAvoidDeadlock(String[] args)
	     { 
	     final String r1 = "Java";
	     final String r2 = "JavaScript";
	     Thread t1 = new Thread()
	       {
	       public void run()
	        { 
	        synchronized(r1)
	         {
	          System.out.println("Thread 1: Locked r1");
	          try
	           { 
	        	  Thread.sleep(100);
	        	  } 
	         catch(Exception e) {} 
	     synchronized(r2)
	      { 
	     System.out.println("Thread 1: Locked r2"); 
	      }  
	     } 
	    } 
	};
	  Thread t2 = new Thread()
	  {
	      public void run()
	       { 
	      synchronized(r1)
	       { 
	       System.out.println("Thread 2: Locked r1"); 
	       try { 
	    	   Thread.sleep(100);
	       } 
	       catch(Exception e) {}              
	     synchronized(r2)
	      {
	      System.out.println("Thread 2: Locked r2");
	       } 
	      } 
	    } 
	}; 
	t1.start();
	t2.start(); 
	}
	
	public static void main (String[] args) {
		toAvoidDeadlock(args);
	}
}
