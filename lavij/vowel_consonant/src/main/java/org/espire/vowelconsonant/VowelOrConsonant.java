package org.espire.vowelconsonant;

public class VowelOrConsonant {
    public static Boolean checkVowelConsonant(char character) {

        Boolean status = Boolean.FALSE;

        //lower or uppercase
        switch (character) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                status = Boolean.TRUE;
        }
        return status;
    }

    public static void main(String args[]){
        checkVowelConsonant('a');
    }
}
