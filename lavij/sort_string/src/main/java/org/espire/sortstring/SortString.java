package org.espire.sortstring;

import java.util.Arrays;
import java.util.Scanner;

public class SortString {

    /**
     * Sort String in alphabetical order
     */
    public static void mainMethod() {
        // user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of string");
        Integer count = sc.nextInt();

        //avoid empty space
        sc.nextLine();

        String string[] = new String[count];
        System.out.println("Enter the string value");
        for (Integer i = 0; i < count; i++) {
            string[i] = sc.nextLine();
        }
        sortString(string, count);
        System.out.println(Arrays.toString(string));
    }

    /**
     * to sort the string
     */
    public static void sortString(String[] string, Integer count) {

        for (Integer i = 0; i < count; i++) {
            for (Integer j = i + 1; j < count; j++) {

                //compare each element
                if (string[i].compareTo(string[j]) > 0) {

                    //swap
                    String temp = string[i];
                    string[i] = string[j];
                    string[j] = temp;
                }
            }
        }
    }

    public static void main(String args[]) {

        mainMethod();

    }
}
