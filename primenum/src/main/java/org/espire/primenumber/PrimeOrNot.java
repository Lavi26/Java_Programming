package org.espire.primenumber;

import java.util.Scanner;

public class PrimeOrNot {
	public static void checkPrime(int num) {
		
		int i,flag=0;
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
