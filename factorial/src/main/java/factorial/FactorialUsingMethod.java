package factorial;

public class FactorialUsingMethod {
	
	/*
	 * Giving the Factorial of a number using method 
	 */
	public static int factorial(int number) {
		
		if (number==0) {
			return 1;
		}
		else {
			
			//checking for each previous number 
			return (number*factorial(number-1));
			
			}
	
	}
			
}
