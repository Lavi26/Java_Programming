package squareroot;

import java.util.Scanner;

public class SquareRootOfNumber { 

	
	/// program to calculate SquareRoot
	
    public static double squareRoot(int number) {
    
    	// declare temporary variable
	double temp;
    
	double sr = number / 2;
 /// loop for calculating square root
	do {
		temp = sr;
		sr = (temp + (number / temp)) / 2;
	} while ((temp - sr) != 0);

	return sr;
    }

    public static void main(String[] args)  
    { 
    	// Taking input from user
	System.out.print("Enter any number:");
	Scanner scanner = new Scanner(System.in);
	int num = scanner.nextInt(); 
	scanner.close();
     //calling method and print value
	System.out.println("Square root of "+ num+ " is: "+squareRoot(num));
    } 
}