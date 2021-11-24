package org.espire.reversestring;

import java.util.Scanner;

public class RevStringUsingMethod {
	
	private static String reverse(String str) {                //reverse method
		if (str == null|| str.equals("")) {                     
			return str;
		}
		
		return str.charAt(str.length()-1)+ reverse(str.substring(0,str.length()-1)); //last char + recur for remaining string
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");

		String str = sc.nextLine();
		
		str= reverse(str);
		
		System.out.println("Reverse of string is:" +str);
	}

}
