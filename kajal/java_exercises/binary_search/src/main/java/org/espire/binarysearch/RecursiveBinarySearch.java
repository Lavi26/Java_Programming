package org.espire.binarysearch;

public class RecursiveBinarySearch {

	// Returns index of x if it is present in arr[l.. r], else return -1
	int recursivebinarysearch(int my_arr[], int left, int right, int x) {
		if (right >= left) {
			int mid = left + (right - left) / 2;

			// If the element is present at the middle itself
			if (my_arr[mid] == x)
				return mid;

			// If element is smaller than mid, then it can only be present in left sub array
			if (my_arr[mid] > x)
				return recursivebinarysearch(my_arr, left, mid - 1, x);

			// Else the element can only be present in right sub array
			return recursivebinarysearch(my_arr, mid + 1, right, x);
		}
		// when element is not present in array
		return -1;
	}

	// main method
	public static void main(String args[]) {
		RecursiveBinarySearch myobject = new RecursiveBinarySearch();
		int my_arr[] = { 56, 78, 90, 32, 45, 99, 104 };
		int len = my_arr.length;
		int x = 32;
		int result = myobject.recursivebinarysearch(my_arr, 0, len - 1, x);
		if (result == -1)
			System.out.println("The element is not present in the array");
		else
			System.out.println("The element has been found at index " + result);
	}
}
