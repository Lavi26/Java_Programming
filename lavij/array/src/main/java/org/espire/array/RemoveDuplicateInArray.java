package org.espire.array;

import java.util.Arrays;

public class RemoveDuplicateInArray {

    /*
     * Remove Duplicate Element From An Array n is the size of array[]
     */
    public static Integer[] removeDuplicates(Integer[] array) {

        if (array.length <= 1) {
            return array;
        }

        Integer j = 0;
        Integer comp[] = new Integer[array.length];

        // checking the element whether it is not equal to the next element
        // store the elements in the temporary array
        for (Integer i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                comp[j] = array[i];
                j++;
            }
        }
        //for last element
        comp[j] = array[array.length - 1];
        j++;

        //comp= Arrays.copyOf(comp,5);

        return Arrays.stream(comp).filter(a -> a != null ).toArray(Integer[]::new);

		// store the element of temporary array into original array
//		for (Integer i = 0; i <= j; i++) {
//			array[i] = comp[i];
//		}
//		return comp ;
    }

    /*
     * sorting array using quick sort algorithm using recursion
     */

    public static void quickSort(Integer array[], Integer first, Integer last) {

        Integer index = partition(array, first, last);

        // call quickSort with left part of partitioned array
        if (first < index - 1) {
            quickSort(array, first, index - 1);
        }

        // call quickSort with right part of partitioned array
        if (last > index) {
            quickSort(array, index, last);
        }
        return;

    }

    /*
     * Divide array from pivot, left side is lesser than pivot and right side is
     * greater than pivot
     */
    public static int partition(Integer array[], Integer left, Integer right) {
        int pivot = array[left];

        while (left <= right) {

            // searching greater than pivot
            while (array[left] < pivot) {
                left++;
            }

            // searching lesser than pivot
            while (array[right] > pivot) {
                right--;
            }

            // swap
            if (left <= right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;

                // increment in left side and decrement in right side
                left++;
                right--;
            }

        }
        return left;

    }

    public static void main(String[] args) {
        //int[] array = { 7, 4, 3, 5, 7, 5 };
        Integer[] array = {7, 7, 7, 1, 1, 1, 2, 2, 2, 4, 4, 4, 0, 0, 0};

        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));

        System.out.println(Arrays.toString(removeDuplicates(array)));
    }
}
