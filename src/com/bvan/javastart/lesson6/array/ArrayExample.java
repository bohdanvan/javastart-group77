package com.bvan.javastart.lesson6.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayExample {

    public static void main(String[] args) {
        int[] a = new int[10];

        // Print
        System.out.println(Arrays.toString(a)); // [0, 0, 0, 0, 0]

        a[1] = 10;
        System.out.println(Arrays.toString(a)); // [0, 10, 0, 0, 0]

        int len = a.length;
        System.out.println(len);

        a[a.length - 1] = 20;
        System.out.println(Arrays.toString(a)); // [0, 10, 0, 0, 20]
    }
}
