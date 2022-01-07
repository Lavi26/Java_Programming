package org.espire.occurrence;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class OccurrenceOfCharacterTest {

    @Test
    public void occurrenceTest(){
        assertEquals(2, OccurrenceOfCharacter.countCharacter("java",'a',0));
    }

    @Test
    public void occurrenceTest1(){
        assertEquals(5, OccurrenceOfCharacter.countCharacter("java is a programming lang",'a',0));
    }
}
