package org.espire.squareroot;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareRootTest {

    @Test
    public void test() {
        assertEquals(2.0, SquareRoot.checkRoot(4), 2.0);

    }

    @Test
    public void test2() {
        assertEquals(4.0, SquareRoot.checkRoot(16), 4.0);

    }

}
