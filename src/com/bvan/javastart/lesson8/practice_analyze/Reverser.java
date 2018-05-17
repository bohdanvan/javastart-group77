package com.bvan.javastart.lesson8.practice_analyze;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class Reverser {

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        reverse(array);
        System.out.println(Arrays.toString(array));
    }

    public static void reverse(int[] array) {
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            swap(array, i, j);
        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
