package org.espire.palindrome;

import java.util.Scanner;
/*
 *Java program to check if a given String is palindrome or not
 */
public class Palindrome {
	
	public static boolean palindrome(String a){
	    if(a.length() == 0 || a.length() == 1){
	      return true;
	    } 
	    if(a.charAt(0) == a.charAt(a.length()-1)){
	      return palindrome(a.substring(1, a.length()-1));
	    }
	      return false;
	  }
	  
	  public static void main(String[]args){
	    Scanner inp = new Scanner(System.in);
	    System.out.print("Enter the string: ");
	    String string = inp.nextLine();
	    if(palindrome(string)){
	      System.out.println(string + " is a palindrome");
	    }
	    else{
	      System.out.println(string + " is not a palindrome");
	    }        
	  }
	}

