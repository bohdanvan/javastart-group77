package com.bvan.javastart.lesson6.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayFiller {

    public static void main(String[] args) {
        int[] a = new int[20];

        // fori + Tab
        int filler = 1;
        for (int i = 0; i < a.length; i++) {
            a[i] = filler;
        }

        System.out.println(Arrays.toString(a));
    }
}
