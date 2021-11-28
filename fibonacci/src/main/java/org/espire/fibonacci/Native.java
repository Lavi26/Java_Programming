package org.espire.fibonacci;


public class Native {
	
	/*
	 *Giving Fibonacci Series
	 * */
	public static int checkFibonacci(int count) {
		int i=1;
		int num1 = 1, num2 = 1;
		while (i<= count) {
			System.out.println(num1 + "");
			int sum = num1 + num2;                  //sum of prev two num
			num1 = num2;
			num2 = sum;
			i++;
		}
		return num2;
		
	}
		

	
}
