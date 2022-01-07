package org.espire.simpleinterest;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SimpleInterestTest {

    @Test
    public void simpleInterestTest(){
        assertEquals(750.0, SimpleInterest.checkSimpleInterest(5000.0,15.0,1.0));
    }

    @Test
    public void simpleInterestTest1(){
        assertEquals(3380.0, SimpleInterest.checkSimpleInterest(13000.0,13.0,2.0));
    }
}
