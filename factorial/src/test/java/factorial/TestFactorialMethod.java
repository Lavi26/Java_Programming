package factorial;

import java.util.Scanner;

import factorial.FactorialUsingMethod;

public class TestFactorialMethod {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int number=sc.nextInt();
		
		FactorialUsingMethod object = new FactorialUsingMethod();
       int fact= object.factorial(number);
			System.out.println("Factorial is "+fact);
		
	}
		
}
		
	
	
	
	
	


