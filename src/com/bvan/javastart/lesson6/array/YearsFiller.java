package com.bvan.javastart.lesson6.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class YearsFiller {

    public static void main(String[] args) {
        int[] years = new int[19];

        for (int i = 0; i < years.length; i++) {
            years[i] = 2000 + i;
        }

//        for (int filler = 2000; filler <= 2018; filler++) {
//            years[filler - 2000] = filler;
//        }

        System.out.println(Arrays.toString(years));
    }
}
