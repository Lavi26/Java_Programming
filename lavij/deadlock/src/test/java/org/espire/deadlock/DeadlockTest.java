package org.espire.deadlock;

import static org.junit.Assert.*;
import org.junit.Test;

public class DeadlockTest {

  @Test
  public void test() throws InterruptedException {
    Sender snd = new Sender();
    ThreadedSend S1 = new ThreadedSend(" Hi ", snd);
    ThreadedSend S2 = new ThreadedSend(" Bye ", snd);

    // Start two threads of ThreadedSend type
    S1.start();
    S2.start();
    
    S1.join();
    S2.join();

  }

}
