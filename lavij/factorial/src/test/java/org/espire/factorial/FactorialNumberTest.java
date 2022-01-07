package org.espire.factorial;

import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class FactorialNumberTest {

    @Test
    public void factorialNumberTest1() {

        assertEquals(120, FactorialNumber.checkFact(5));

    }

    @Test
    public void factorialNumberTest2() {

        assertEquals(5040, FactorialNumber.checkFact(7));
    }

    @Test
    public void factorialMethodTest() {

        assertEquals(120, FactorialUsingMethod.factorial(5));

    }

    @Test
    public void factorialMethodTest1() {

        assertEquals(5040, FactorialUsingMethod.factorial(7));
    }


}
