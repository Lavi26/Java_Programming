package org.espire.squareroot;

import java.util.Scanner;

public class TestSquareRoot {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");

		int num = sc.nextInt();
		SquareRoot obj= new SquareRoot();
		obj.checkRoot(num);
		

	}
	

}
