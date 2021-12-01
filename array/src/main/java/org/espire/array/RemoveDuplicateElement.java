package org.espire.array;

public class RemoveDuplicateElement {
	
	/*
	 * Remove Duplicate Element From An Array
	 * n is the size of array[]
	 * */
	
	public static int checkArray(int array[], int n) {

		if (n == 0 || n == 1) {
			return n;
		}
        
		int k = 0;
		int comp[]= new int[n];
		
		//checking the element..whether it is not equal to the next  element 
		//store the elements in the temporary array
		for (int i = 0; i < n-1; i++) {
			if (array[i] != array[i+1]) {
				comp[k] = array[i];
				k++;
			}
		}
		
		comp[k] = array[n-1];
		k++;
        
		//store the element of temporary array into original array
		for (int i = 0; i < k; i++) {
			array[i] = comp[i];
		}
		return k;

	}

	

}
