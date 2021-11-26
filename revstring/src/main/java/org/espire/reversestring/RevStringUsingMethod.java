package org.espire.reversestring;

import java.util.Scanner;

public class RevStringUsingMethod {
	
	public static String reverse(String str) {                //reverse method
		if (str == null|| str.equals("")) {                     
			return str;
		}
		
		return str.charAt(str.length()-1)+ reverse(str.substring(0,str.length()-1)); //last char + recur for remaining string
	}
	
	

}
