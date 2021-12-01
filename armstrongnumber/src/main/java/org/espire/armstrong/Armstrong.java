package org.espire.armstrong;

import java.util.Scanner;

public class Armstrong {
	/**
	 *
	 * Checking whether number is armstrong or not
	 */
    public static String calculate(int num) {
    	
        int remainder, total = 0;
        int orgnumber = num;
        
        //sum of the cube of each digit until 0
        while (orgnumber != 0) {
            remainder = orgnumber % 10;
            total = total + remainder * remainder * remainder;
            orgnumber = orgnumber / 10;
        }
        
        //comparing 
        if (total == num)
           return "Number is Armstrong";
        else
        	return "Number is not Armstrong";
    }
}
