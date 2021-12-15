package palindrome;
import java.util.Scanner;

public class Palindrome {
	
	
	 static boolean isPalindrome(String input) {

	        //Converting input to Lowercase and removing all white spaces
	        input = input.toLowerCase().replaceAll("\\s+", "");

	        //Length of input
	        int length = input.length();


	        //Character by character comparision
	        for (int i = 0; i < length / 2; i++) {
	            if (input.charAt(i) != input.charAt(length - i - 1)) {
	                return false;
	            }
	        }
	        return true;
	    }

    
	public static void main(String[] args) {

        Palindrome palindrome = new Palindrome();
        System.out.println(" Enter String");

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();


        if (palindrome.isPalindrome(input))
            System.out.println("\"" + input + "\" is a palindrome.");
        else
            System.out.println("\"" + input + "\" is not a palindrome.");

    }

   

}
