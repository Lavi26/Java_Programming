package factorial;

import java.util.Scanner;

public class FactorialUsingMethod {
	public static int factorial(int number) {
		
		if (number==0) {
			return 1;
		}
		else {
			return (number*factorial(number-1));
			
			}
	
	}
			
}
