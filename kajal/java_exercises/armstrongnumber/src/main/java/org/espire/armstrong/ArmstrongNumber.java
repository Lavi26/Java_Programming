package org.espire.armstrong;

/*
 * a program to check if the given number is Armstrong number or not
 */
public class ArmstrongNumber {
	
	public static void main(String[] args) {
        int number = 153;
        if(isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number!");
        } else {
            System.out.println(number + " is an NOT Armstrong number!");
        }
    }
     
    public static boolean isArmstrong(int n) {
        int no_of_digits = String.valueOf(n).length();
        int sum = 0;
        int value = n;
        for(int i=1;i<=no_of_digits;i++) {
            int digit = value%10;
            value = value/10;
            sum = sum + (int)Math.pow(digit, no_of_digits);
        }
        if(sum == n) {
            return true;
        }else {
            return false;
        }
    }
	}