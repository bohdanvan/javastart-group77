package com.bvan.javastart.lesson7.method;

/**
 * @author bvanchuhov
 */
public class Sum {

    public static void main(String[] args) {
        // test

        int x = sum(sum(40, 20), sum(30, 70));
        System.out.println(x); // 160
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
