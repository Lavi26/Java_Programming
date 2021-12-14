package org.espire.palindrome;

import java.util.Scanner;
/*
 *Java program to check if a given String is palindrome or not
 */
public class Palindrome {
	
	public static boolean palindrome(String a)
	/*Step1:
	 * Check if the length is equal to zero or one .Print it is a palindrome
	 */
	
	{
	    if(a.length() == 0 || a.length() == 1){
	      return true;
	    } 
	   /*Step2:
	     * Check each character in substring from the front and rear, if found equal Print it is palindrome
	     */
	   
	    if(a.charAt(0) == a.charAt(a.length()-1)){
	      return palindrome(a.substring(1, a.length()-1));
	    }
	      return false;
	  }
	  
	  public static void main(String[]args){
	    Scanner inp = new Scanner(System.in);
	    System.out.print("Enter the string: ");
	    String string = inp.nextLine();
	    
	    if(palindrome(string))
	    	/*
		     * If steps 1 and 2 pass Print it is  Palindrome
		     */
	    {
	      System.out.println(string + " is a palindrome");
	    }
	    else
	    	/*
		     * If steps 1 and 2 fails Print it is not  Palindrome
		     */
	    {
	      System.out.println(string + " is not a palindrome");
	    }        
	  }
	}



