package com.bvan.javastart.lesson6.array;

/**
 * @author bvanchuhov
 */
public class ArraySum {

    public static void main(String[] args) {
        int[] a = {10, 30, 5, 100, -50};

        int sum = 0;
        for (int elem : a) {
            sum += elem;
        }

        System.out.println(sum);
    }
}
