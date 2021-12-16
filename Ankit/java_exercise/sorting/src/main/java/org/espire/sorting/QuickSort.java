package org.espire.sorting;

public class QuickSort {

	public static void quick(Integer array[], Integer p, Integer size) {
		Integer q;
		if (p < size) {
			q = partition(array, p, size);
			quick(array, p, q - 1);
			quick(array, q + 1, size);
		}
	}

	public static int partition(Integer array[], Integer p, Integer size) {
		Integer x, i, j, temp;
		x = array[size];
		i = p - 1;
		for (j = p; j <= size - 1; j++) {
			if (array[j] <= x) {
				i = i + 1;
				temp = array[j];
				array[j] = array[i];
				array[i] = temp;
			}
		}
		temp = array[size];
		array[size] = array[i + 1];
		array[i + 1] = temp;
		return i + 1;
	}

	public static void main(String args[]) {
		Integer array[] = { 10,9, 20, 50, 30};
		Integer p, i;

		p = 1;
		quick(array, p, array.length-1);
		for (i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}
}
