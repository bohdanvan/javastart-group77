package com.bvan.javastart.lesson4.loop;

/**
 * @author bvanchuhov
 */
public class ForExample {

    public static void main(String[] args) {
        // n = 10, 11, ... 20
        for (int n = 10; n <= 20; n++) {
            System.out.print(n + " ");
        }
        System.out.println();

        // n = 50, 49, 48 ... 40
        for (int n = 50; n >= 40 ; n--) {
            System.out.print(n + " ");
        }
        System.out.println();

        // n = 10, 20, 30, ... 100
        for (int n = 10; n <= 100; n += 10) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
