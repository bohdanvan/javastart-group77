package com.bvan.javastart.lesson6.triangle;

/**
 * @author bvanchuhov
 */
public class ReversedTrianglePrinter {

    public static void main(String[] args) {
        int size = 10;

        // Print triangle
        for (int count = size; count >= 1; count--) {

            // Print line
            for (int n = 1; n <= count; n++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }
}
