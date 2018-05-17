package com.bvan.javastart.lesson8.value_storing.mutable_object;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class ScannerExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Scanner fakeScanner = scanner;
        fakeScanner.useDelimiter(",");

        String name = scanner.next();
        int age = scanner.nextInt();

        String message = "Hello, I'm " + name + ", "
                + age + " years old";

        System.out.println(message);
    }
}
