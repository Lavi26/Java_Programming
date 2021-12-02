package org.espire.armstrong;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArmstrongTest {

    @Test
    public void test() {
        assertEquals(Armstrong.calculate(407), Boolean.TRUE);
        assertEquals(Armstrong.calculate(153), Boolean.TRUE);
        assertEquals(Armstrong.calculate(154), Boolean.FALSE);
    }
}
