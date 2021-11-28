package palindromenumber;

import java.util.Scanner;

import org.espire.palindrome.StringPalindrome;

public class TesstStringPalindrome {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");

		String input = sc.nextLine();
		
		StringPalindrome object= new StringPalindrome();
		object.isPalindrome(input);

	}

}
