package org.espire.vowelconsonant;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CountVowelsConsonantsTest {

    @Test
    public void countTest(){
        assertEquals("vowels are 2 consonants are 5",CountVowelsConsonants.countVowelConsonant("testing"));
    }
    @Test
    public void countTest1(){
        assertEquals("vowels are 8 consonants are 14",CountVowelsConsonants.countVowelConsonant("Java Is A Programming Lang"));
    }
}
