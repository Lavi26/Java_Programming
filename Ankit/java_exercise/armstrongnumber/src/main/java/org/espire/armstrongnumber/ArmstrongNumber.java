package org.espire.armstrongnumber;

import java.util.Scanner;

public class ArmstrongNumber {

	/*
	 * Method to check armstrong number
	 */
	public static String isArmstrongNumber(int number) {
		
		//Declaring and initializing variable with zero
		int sum=0,remainder=0;
		int temp=number;
		
		//Loop for dividing number and find cubic sum of the number
		while(temp>0) {
			remainder=temp%10;
			sum=sum+(remainder*remainder*remainder);
			temp=temp/10;
		}
		
		//Checking
		if(number==sum) {
			return "Number is armstrong";
		}
		else {
			return "Number is not armstrong";
		}
	}
	
	//Main method
	public static void main(String args[]) {
		
		//Creating objecct of scanner sclass
		Scanner sc=new Scanner(System.in);
		
		//Taking input from the user
		int input=sc.nextInt();
		
		//calling isArmstrongNumber() method
		String str=isArmstrongNumber(input);
		System.out.println(str);
	}
}
