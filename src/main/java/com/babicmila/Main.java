package com.babicmila;

import java.util.Arrays;

import com.babicmila.sorting.SelectionSort;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[10];

        // generates random values, and adds them to the array
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
        }

        // prints array before sorting
        System.out.println(Arrays.toString(array));

        SelectionSort.selectionSort(array);
        System.out.println("Selection sort: " + Arrays.toString(array));

    }
}