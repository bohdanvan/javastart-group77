package com.bvan.javastart.lesson8.value_storing;

/**
 * @author bvanchuhov
 */
public class Scope {

    public static void main(String[] args) {
        int x = 10;
        int z = 0;

        if (x < 20) {
            int y = 20;
            // (1)
            System.out.println(y);
        }
        // (2)

        f(x);
        System.out.println("x = " + x);
    }

    public static void f(int x) {
        x++;
    }
}
