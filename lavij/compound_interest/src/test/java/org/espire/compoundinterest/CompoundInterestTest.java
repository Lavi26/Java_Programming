package org.espire.compoundinterest;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CompoundInterestTest {

    @Test
    public void compoundInterestTest(){
        assertEquals(125.50881000000004, CompoundInterest.checkCompoundInterest(1000.0,3.0,4.0));
    }
    @Test
    public void compoundInterestTest1(){
        assertEquals(91.34999999999991, CompoundInterest.checkCompoundInterest(1500.0,3.0,2.0));
    }
}
