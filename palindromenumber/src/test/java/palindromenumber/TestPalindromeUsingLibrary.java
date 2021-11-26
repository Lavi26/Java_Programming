package palindromenumber;

import java.util.Scanner;

import org.espire.palindrome.PalindromeUsingLibrary;

public class TestPalindromeUsingLibrary {
	public static void main(String args[]) {
		

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a String: ");

			String orgStr = sc.nextLine();
			PalindromeUsingLibrary obj= new PalindromeUsingLibrary();

			if (obj.isPalindrome(orgStr)) // checking
				System.out.println("String is Palindrome");
			else
				System.out.println("String is not Palindrome");

		}

	
	
	
	
	
}
