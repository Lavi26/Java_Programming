package com.espire.factorial;

import java.util.Scanner;

public class FactorialNo {
	public static int findFactorial (int input) {
		int fact=1;//declaring a variable
		for(int i=1;i<=input;i++) {
			fact=fact*i;
		}
		return fact;
		
	}
	
//main method
public static void main (String[] ag) {
	Scanner sc=new Scanner(System.in);
	int input=sc.nextInt();
	System.out.println(findFactorial(input));
}
}
