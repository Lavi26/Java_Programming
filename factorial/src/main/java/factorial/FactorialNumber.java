package factorial;

import java.util.Scanner;

public class FactorialNumber {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int i, fact=1;
		int num=sc.nextInt();
		
		for(i=1;i<=num;i++) {
			fact=fact*i;
		}
		
		System.out.println("Factorial of number is: "+ fact);
	}

}
