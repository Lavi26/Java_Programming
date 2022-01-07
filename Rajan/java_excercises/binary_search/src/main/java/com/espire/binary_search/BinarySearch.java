package com.espire.binary_search;

public class BinarySearch {
	public static void main(String[] ag) {
		int[] a = { 2, 4, 5, 6, 8, 9, 11, 14, 17, 24, 28 };
		int srch = 12;
		int li = 0;
		int hi = a.length - 1;
		int mi = (li + hi) / 2;
		while (li <= hi) {
			if (a[mi] == srch) {
				System.out.println("Element is at " + mi + " index position");
				break;
			} else if (a[mi] < srch) {
				li = mi + 1;
			} else {
				hi = mi - 1;
			}
			mi = (li + hi) / 2;

		}
		if (li > hi) {
			System.out.println("Element not found");
		}
	}
}