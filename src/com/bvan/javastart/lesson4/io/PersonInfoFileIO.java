package com.bvan.javastart.lesson4.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class PersonInfoFileIO {

    public static void main(String[] args) throws FileNotFoundException {
        // Input
        // 1. Create new Scanner object.
        File file = new File("files/person.txt");
        Scanner scan = new Scanner(file);

        // 2. Read data with the scanner.
        String name = scan.next();
        int age = scan.nextInt();

        // 3. Close the scanner.
        scan.close();

        // BL
        String message = "Hello, I'm " + name + ", "
                + age + " years old";

        // Output
        System.out.println(message);
    }
}
