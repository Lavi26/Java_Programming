package org.espire.armstrong;

import java.util.Scanner;

public class Armstrong {
	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");

		int num = scanner.nextInt();
		int remainder, total = 0;
		int orgnumber = num;

		while (orgnumber != 0) {
			remainder = orgnumber % 10;
			total = total + remainder * remainder * remainder;
			orgnumber = orgnumber / 10;
		}

		if (total == num)
			System.out.println("Number is Armstrong");
		else
			System.out.println("Number is not Armstrong");
	}

}
