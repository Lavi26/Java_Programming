package fibonacci;

import java.util.Scanner;


public class FibonacciSeries {

	/*
	 * Giving Fibonacci Series
	 */
	public static int checkFibonacci(int n) {
		
		int num1 = 0, num2 = 1;
		for (int i = 1; i <= n; ++i) {
		      System.out.println(num1);

		      // compute the next term
		      int nextTerm = num1 + num2;
		      num1 = num2;
		      num2 = nextTerm;
		}
		return num1;	

	}

	public static void main(String args[]) {
		

        System.out.println("Enter Number");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        
        //calling method

		FibonacciSeries.checkFibonacci(input);	

	}

}
