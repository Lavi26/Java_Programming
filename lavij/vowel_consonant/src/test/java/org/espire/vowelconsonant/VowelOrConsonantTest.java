package org.espire.vowelconsonant;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class VowelOrConsonantTest {

    @Test
    public void vowelConsonantTest(){
        assertEquals(Boolean.TRUE, VowelOrConsonant.checkVowelConsonant('a'));
    }

    @Test
    public void vowelConsonantTest1(){
        assertEquals(Boolean.FALSE, VowelOrConsonant.checkVowelConsonant('B'));
    }
}
