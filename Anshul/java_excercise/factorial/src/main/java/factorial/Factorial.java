package factorial;

import java.util.Scanner;

public class Factorial {

	/*
	 *  Method for find the factorial of a number
	 */
	public static int checkFact(int n) {
		
		/// Declaring variables
		
		int i, fact = 1;

		if (n == 0) {
			return 1;
		}
		else {			
			for (i = 1; i <= n; i++) {
				fact = fact * i;
			}
		}
		
		return fact ;

	}

	public static void main(String args[]) {
		
		// Taking input from keyboard
		System.out.println(" Enter Number");

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        
        //calling method
        System.out.println(Factorial.checkFact(input));

	}

}
