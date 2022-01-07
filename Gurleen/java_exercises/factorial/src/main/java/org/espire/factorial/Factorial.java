package org.espire.factorial;

import java.util.Scanner;

public class Factorial {
	
	public static String isFactorial(String str)
	   {
	      int num, i, fact=1;
	      Scanner s = new Scanner(System.in);
	      
	      System.out.print("Enter a Number: ");
	      num = s.nextInt();
	      
	      for(i=num; i>=1; i--)
	      {
	         fact = fact*i;
	      }
	      
	      System.out.println("\nFactorial Result = " +fact);
		
	      return str;
	   }

	public static void main(String str) {
		isFactorial(str);

	}

}
