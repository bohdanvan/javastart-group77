package com.bvan.javastart.lesson6.triangle;

/**
 * @author bvanchuhov
 */
public class TrianglePrinter {

    public static void main(String[] args) {
        int size = 10;

        // Print triangle
        for (int count = 1; count <= size; count++) {

            // Print line
            for (int n = 1; n <= count; n++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }
}
