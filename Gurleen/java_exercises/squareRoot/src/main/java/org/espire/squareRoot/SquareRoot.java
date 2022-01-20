/**
 * 
 */
package org.espire.squareRoot;

import java.util.Scanner;

/**
 * @author gurleen.kaur
 *
 */
public class SquareRoot {
	
	public static String isSquareRoot(String str) {
	Double num;
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter a number: ");
	num = sc.nextDouble();
	Double squareroot = Math.pow(num, 0.5);
	System.out.println("The Square of a Given Number  " + num + "  =  " + squareroot);
	return str;
	}

	/**
	 * @param args
	 */
	public static void main(String str) {
		isSquareRoot(str);

	}

}
