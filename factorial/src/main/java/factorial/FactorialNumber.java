package factorial;

import java.util.Scanner;

public class FactorialNumber {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		
		int i, fact=1;
		
		if(num==0) {
			System.out.println("Factorial of number is 1");
		}
		else {
		for(i=1;i<=num;i++) {
			fact=fact*i;
		}
		
		System.out.println("Factorial of number is: "+ fact);
		}
	}
		

}
