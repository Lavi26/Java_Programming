package org.espire.armstrong;

import java.util.Scanner;

public class Armstrong {


	/**
	 *
	 * Checking whether number is armstrong or not
	 */
    public static boolean calculate(int num) {
    	
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
           return true;
        else
        	return false;

    }
    
    public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");

		int num = scanner.nextInt();
		
		Armstrong object=new Armstrong();
		if(object.calculate(num)) {
			System.out.println("Number is Armstrong");
		}
		else {
			System.out.println("Number is Not Armstrong");
		}
		
    }

}
