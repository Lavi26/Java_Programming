package org.espire.bubblesort;

public class BubbleSort2 {
	public static void main(String args[]) {
		Integer array[] = { 4, 15, 12, 21, 2, 25, 10, 18 };
		Integer temp;
		System.out.println("integer in sorted order");
		for (int j = 0; j < array.length; j++) {
			for (int i = j + 1; i < array.length; i++) {
				if (array[i].compareTo(array[j]) < 0) {
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
			System.out.println(array[j]);
		}

	}
}
