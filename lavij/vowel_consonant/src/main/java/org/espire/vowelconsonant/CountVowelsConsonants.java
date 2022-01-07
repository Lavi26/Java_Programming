package org.espire.vowelconsonant;

public class CountVowelsConsonants {
    /**
     * Find the number of vowel and consonant in a string
     */
    public static String countVowelConsonant(String str) {

        char ch;
        Integer vowel = 0, consonant = 0;

        //traverse string from 0 index to length
        for (Integer i = 0; i < str.length(); i++) {

            //store element at index i of the string to ch variable
            ch = str.charAt(i);

            //checking for vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowel++;
            } else {
                //checking for consonant
                if (ch > 'a' && ch <= 'z' || ch > 'A' && ch <= 'Z') {
                    consonant++;
                }
            }
        }
        return "vowels are " + vowel + " consonants are " + consonant;
    }

    public static void main(String args[]) {
        System.out.println(countVowelConsonant("Java Is A Programming Lang"));
    }
}
