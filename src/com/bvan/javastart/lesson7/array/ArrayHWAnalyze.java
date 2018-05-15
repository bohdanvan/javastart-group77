package com.bvan.javastart.lesson7.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayHWAnalyze {

    public static void main(String[] args) {
        // 1
        boolean[] bools = new boolean[30];
        System.out.println(Arrays.toString(bools));

        // 2
        double[] doubles = {10.2, 5.6, 7.8, 11.9};

        // 3
        int[] array1 = {10, 30, 40};
        int length = array1.length;
        System.out.println(length);

        // 4
        String s = Arrays.toString(array1);
        System.out.println(s);

        // 5
        int[] array2 = new int[10];
        Arrays.fill(array2, 42);
        System.out.println(Arrays.toString(array2));

        // 6
        int[] array3 = {20, 10, 5, 15, 30};
        Arrays.sort(array3);
        System.out.println(Arrays.toString(array3));

        // 7
        int[] array = {10, -5, 0, 20, 30};
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                System.out.println(i);
            }
        }
        System.out.println();

        // 8
        for (int elem : array) { // for-each
            if (elem > 0) {
                System.out.println(elem);
            }
        }
        System.out.println();


        // 9
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > 0) {
                System.out.println(array[i]);
            }
        }
    }
}
