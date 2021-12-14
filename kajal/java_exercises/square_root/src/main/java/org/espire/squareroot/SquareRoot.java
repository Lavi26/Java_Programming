package org.espire.squareroot;
/*
 * write a program to calculate the square root of a number without using the Math.sqrt() function 
 */
public class SquareRoot {
	 public static double square(double number){
		    double t;
		  
		    double squareroot = number / 2;
		  
		    do {
		        t = squareroot;
		        squareroot = (t + (number / t)) / 2;
		    } while ((t - squareroot) != 0);
		  
		    return squareroot;
		}
		 
		public static void main(String[] args)
		{
		    double number = 16;
		    double root;
		    root = square(number);
		    System.out.println("Number : "+number);
		    System.out.println("Square Root : "+root);
		}
		}
