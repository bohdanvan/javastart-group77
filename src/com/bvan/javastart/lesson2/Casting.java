package com.bvan.javastart.lesson2;

/**
 * @author bvanchuhov
 */
public class Casting {

    public static void main(String[] args) {
        int x = 2_000_000_000;
        long y = 1_000_000_000;

        long res1 = x + y;
        int res2 = (int)(x + y); // BAD PRACTICE

        System.out.println(res1);
        System.out.println(res2);
    }
}
