package com.babicmila.sorting;

public class SelectionSort {

    public static int[] selectionSort(int[] array) {

        int length = array.length;

        for (int i = 0; i < length - 1; i++) {

            int minValue = array[i];
            int indexOfMin = i;

            for (int j = i + 1; j < length; j++) {

                if (array[j] < minValue) {
                    minValue = array[j];
                    indexOfMin = j;
                }
            }

            swap(array, i, indexOfMin);

        }

        return array;
    }

    private static void swap(int[] array, int a, int b) {

        int temp = array[a];

        array[a] = array[b];
        array[b] = temp;
    }

}
