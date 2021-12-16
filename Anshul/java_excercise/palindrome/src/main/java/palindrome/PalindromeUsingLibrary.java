package palindrome;

import java.util.Scanner;

public class PalindromeUsingLibrary {

	/*
	 * checking whether string is palindrome using methods
	 */
	public static boolean isPalindrome(String s) {
		if (s.length() <= 1) {
			return true;
		}

        //Character by character comparision
		if (s.charAt(0) == s.charAt(s.length() - 1))

			return isPalindrome(s.substring(1, s.length() - 1));

		return false;

	}

	public static void main(String args[]) {
		
        System.out.println(" Enter String");

		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		if (isPalindrome(input)) // checking string 
			System.out.println("String is Palindrome");
		else
			System.out.println("String is not Palindrome");

	}

}
