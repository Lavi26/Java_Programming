package factorial;

import java.util.Scanner;

public class FactorialRecursive {
	
	/*
	 * Program to find the factorial
	 */
	public static int findFactorial(int number) {
		
		if(number<1) {
			return 1;
		}
		else {
			//recursive call
			return number*findFactorial(number-1);
		}
		
	}
	
	//Main method
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		//Taking input from user
		int input=sc.nextInt();
		
		//calling the method
	    findFactorial(input);		
	}
}
