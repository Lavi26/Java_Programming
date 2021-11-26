package org.espire.armstrong;

import java.util.Scanner;

public class Armstrong {
	public static String calculate(Integer value) {
		int remainder, total = 0;
		int orgnumber = value;

		while (orgnumber != 0) {
			remainder = orgnumber % 10;
			total = total + remainder * remainder * remainder;
			orgnumber = orgnumber / 10;
		}

		if (total == value) 
			return "number is armstrong";
		else
		    return "number is not armstrong";
	}

	
	
}
