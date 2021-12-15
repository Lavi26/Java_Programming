package org.espire.string;

public class ReverseString {
	// Function to reverse a string
	public static String reverseString(String str){  
	//Converting the string into a character array
	    char ch[]=str.toCharArray();  
	    String rev="";  
	  //For loop to reverse a string
	    for(int i=ch.length-1;i>=0;i--){  
	        rev+=ch[i];  
	    }  
	    return rev;  
	}  

public static void main(String[] args) {  
    System.out.println(ReverseString.reverseString("java programming"));  
    System.out.println(ReverseString.reverseString("python programming"));      
    }  }
