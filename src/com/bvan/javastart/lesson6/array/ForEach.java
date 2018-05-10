package com.bvan.javastart.lesson6.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ForEach {

    public static void main(String[] args) {
        int[] a = {10, 20, 3};

//         DO NOT WORK (for-each is read-only)
//        for (int elem : a) {
//            elem = 1;
//        }

//        for (int i : a) {
//            System.out.println(a[i]); <----- bad (i is NOT index)
//        }


        // iter
        for (int elem : a) {
            System.out.println(elem);
        }

        System.out.println(Arrays.toString(a));
    }
}
