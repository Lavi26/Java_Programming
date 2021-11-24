package factorial;

import java.util.Scanner;

public class FactorialUsingMethod {
	static int factorial(int num) {
		if (num==0)
			return 1;
		else
			return(num*factorial(num-1));
			}
			
			public static void main(String args[]) {

				Scanner sc = new Scanner(System.in);
				System.out.println("Enter a number: ");
				
				int number=sc.nextInt();
				int fact=factorial(number);
				
				System.out.println("Factorial of number is: "+ fact);
		}

	

}
