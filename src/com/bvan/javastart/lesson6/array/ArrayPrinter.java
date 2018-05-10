package com.bvan.javastart.lesson6.array;

/**
 * @author bvanchuhov
 */
public class ArrayPrinter {

    public static void main(String[] args) {
        int[] a = {10, 30, 5};

        for (int i = 0; i < a.length; i++) {
            int elem = a[i];
            elem = 1;
            System.out.println(elem);
        }
        System.out.println();

        // for-each
        for (int elem : a) {
            System.out.println(elem);
        }
    }
}
