package factorial;

import java.util.Scanner;

import factorial.FactorialNumber;


public class TestFactorialNumber {
	public static void main(String args[]) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number: ");
			int num = sc.nextInt();
			System.out.println("Factorial of number is: ");
			
			FactorialNumber obj= new FactorialNumber();
			obj.checkFact(num);

			FactorialUsingMethod object = new FactorialUsingMethod();
			int fact = object.factorial(num);
			System.out.println("Factorial is " + fact);
		
	}

}
