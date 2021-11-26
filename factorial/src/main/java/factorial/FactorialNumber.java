package factorial;

import java.util.Scanner;

public class FactorialNumber {
	public static int checkFact(int n) {
		int i, fact = 1;

		if (n == 0) {
			return 1;
		} 
		else {
			for (i = 1; i <= n; i++) {
				fact = fact * i;
				
			}		
		}
		System.out.println(+fact);
		return fact;	

	}

	
}
