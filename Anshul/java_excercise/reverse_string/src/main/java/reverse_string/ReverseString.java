package reverse_string;
import java.util.Scanner;

public class ReverseString {
	public static String  reverse(String input){
		
		// Here converting string into char array
		char[] ch = input.toCharArray();

		// declare empty string
		String reverseInput = "";

		// reading from end to first
		for (int i = ch.length - 1; i >= 0; i--) {
			reverseInput = reverseInput + ch[i];
		}

		return reverseInput;
		
	}
	
	public static void main(String [] agrs)
	{
		
		// Taking input from keyboard
		System.out.println(" Enter String");

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        
        // calling method and print result
        System.out.println(ReverseString.reverse(input));
		
	}

}
