package org.espire.armstrong;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.core.IsEqual.equalTo;
public class TestArmstrongNumber {

	@Test
    public void test() {
        assertEquals(Boolean.TRUE,ArmstrongNumber.isArmstrong(153));
        assertEquals(Boolean.TRUE,ArmstrongNumber.isArmstrong(370));
        assertEquals(Boolean.FALSE,ArmstrongNumber.isArmstrong(123));
        assertEquals(Boolean.FALSE,ArmstrongNumber.isArmstrong(125));
        
    }
	    }
	