package primenum;

import java.util.Scanner;

import org.espire.primenumber.PrimeOrNot;

public class TestPrimeNumber {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
	
		PrimeOrNot object=new PrimeOrNot();
		object.checkPrime(num);
		
	}

}
