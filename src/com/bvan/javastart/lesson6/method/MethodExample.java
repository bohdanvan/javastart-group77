package com.bvan.javastart.lesson6.method;

/**
 * @author bvanchuhov
 */
public class MethodExample {

    public static void main(String[] args) {
        int x = min(10, 20); // вызов метода
        int y = min(40, 20); // вызов метода
        System.out.println(x + y);
    }

    // Creator
    public static int min(int a, int b) { // signature
        int min;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }

        return min;
    }
}
