package org.espire.fibonacci;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class FibonacciSeriesTest {

    @Test
    public void test() {

        assertNotNull(FibonacciSeries.checkFibonacci(7));

    }

    @Test
    public void test1() {

        assertNotNull(FibonacciSeries.checkFibonacci(5));
    }

}
