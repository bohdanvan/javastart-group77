package com.bvan.javastart.lesson8.practice_analyze;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class Zebra {

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(createZebra(-1)));
        System.out.println(Arrays.toString(createZebra(4)));
        System.out.println(Arrays.toString(createZebra(5)));
    }

    public static String[] createZebra(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("negative size: " + size);
        }

        String[] zebra = new String[size];

        // fori + Tab
        for (int i = 0; i < zebra.length; i++) {
            zebra[i] = (i % 2 == 0) ? "black" : "white";
        }

        return zebra;
    }
}
