package org.espire.array;

import java.util.Scanner;

public class RemoveDuplicateElement {
	public static int checkArray(int array[], int n) {

		if (n == 0 || n == 1) {
			return n;
		}
        
		int k = 0;
		int comp[]= new int[n];
		for (int i = 0; i < n-1; i++) {
			if (array[i] != array[i+1]) {
				comp[k] = array[i];
				k++;
			}
		}
		comp[k] = array[n-1];
		k++;

		for (int i = 0; i < k; i++) {
			array[i] = comp[i];
		}
		return k;

	}

	

}
