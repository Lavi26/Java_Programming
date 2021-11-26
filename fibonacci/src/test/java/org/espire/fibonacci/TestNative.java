package org.espire.fibonacci;

import java.util.Scanner;

public class TestNative {
	public static void main(String args[]) {
		

			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the number: ");
			int count1 = scanner.nextInt();
			System.out.println("Fibonacci series is:");
			
			
			Native obj=new Native();
			obj.checkFibonacci(count1);
			
		}

	
}
