package org.espire.removeDuplicate;

import java.util.Arrays;

public class RemoveDuplicate {
	
	public static void removeDuplicate(int arr[]) {
	// Sort an unsorted array
			Arrays.sort(arr);
			int len = arr.length;
			int j = 0;
			// Traverse an array
			for (int i = 0; i < len - 1; i++) {
				// if value present at i and i+1 index is not equal
				if (arr[i] != arr[i + 1]) {
					arr[j++] = arr[i];
				}
			}
			arr[j++] = arr[len - 1];
			for (int k = 0; k < j; k++) {
				System.out.print(arr[k] + " ");
			}
		}

	//main method
		public static void main(String[] args) {
			int arr[] = { 30, 43, 30, 76, 19, 99, 76, 30, 19, 36 };
			removeDuplicate(arr);
		}
}
