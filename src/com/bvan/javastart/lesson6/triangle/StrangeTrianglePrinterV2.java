package com.bvan.javastart.lesson6.triangle;

/**
 * @author bvanchuhov
 */
public class StrangeTrianglePrinterV2 {

    public static void main(String[] args) {
        int size = 5;

        for (int i = size; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
