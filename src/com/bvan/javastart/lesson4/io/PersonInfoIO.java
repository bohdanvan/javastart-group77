package com.bvan.javastart.lesson4.io;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class PersonInfoIO {

    public static void main(String[] args) {
        // Input
        // 1. Create new Scanner object.
        Scanner scan = new Scanner(System.in);

        // 2. Read data with the scanner.
        System.out.print("Enter name: ");
        String name = scan.next();

        System.out.print("Enter age: ");
        int age = scan.nextInt();

        // BL
        String message = "Hello, I'm " + name + ", "
                + age + " years old";

        // Output
        System.out.println(message);
    }
}
