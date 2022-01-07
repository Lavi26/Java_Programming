package org.espire.squareRoot;

import java.util.Scanner;

public class SquareRoot {
	 
	// Method to find the Square root of a number
	 
	public static double findSquareRoot(int num) {

		double t, squareroot=num/2;  

		// until the difference of approximate value and root value is not equal to 0
		do   
		{  
		t=squareroot; 
		
		squareroot = ( t + (num/t) ) / 2;  
		}   
		while((t-squareroot)!= 0); 
		
		return squareroot;  
		}  

	public static void main(String args[])
	{
		System.out.print("Enter a number: ");  
		
		//creating object of the Scanner class  
		
		Scanner sc = new Scanner(System.in);  
		
		//reading a number form the user  
		
		int n = sc.nextInt();  
		
		//calling the method and prints the result  
		
		System.out.println("The square root of "+ n + " is: "+ findSquareRoot(n));  
		}  
}
