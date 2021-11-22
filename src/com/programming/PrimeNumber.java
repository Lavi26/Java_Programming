package com.programming;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
        int i,flag=0;
		int num = sc.nextInt();
		int m= num/2;
		
		if(num==0||num==1)
		{
			System.out.println("Number is not prime");
		}
		else
		{
			for(i=2;i<=m;i++) {
				if(num%i==0)
				{
					System.out.println("Number is not Prime");
					flag=1;
				}
			}
			if(flag==0) {
				System.out.println("Number is Prime");
			}
		}
		

	}

}
