package revstring;

import java.util.Scanner;

import org.espire.reversestring.RevStringUsingMethod;

public class TestRevStringMethod {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");

		String str = sc.nextLine();
		RevStringUsingMethod obj = new RevStringUsingMethod();
		str = obj.reverse(str);

		System.out.println("Reverse of string is:" + str);
	}

		
		

}
