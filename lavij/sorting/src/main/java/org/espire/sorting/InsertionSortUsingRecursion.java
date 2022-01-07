package org.espire.sorting;

import java.util.Arrays;

public class InsertionSortUsingRecursion {

    public static void insertionSort(Integer a[], Integer len) {
        if (len <= 1) {
            return;
        }

        insertionSort(a, len - 1);

        Integer last = a[len - 1];
        Integer j = len - 2;

        while (j >= 0 && a[j] > last) {
            a[j + 1] = a[j];
            j--;
        }
        a[j + 1] = last;
    }

    public static void main(String args[]) {

        Integer array[] = {5, 3, 2, 4, 1};

        insertionSort(array, array.length);
        System.out.println(Arrays.toString(array));
    }
}
