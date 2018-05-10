package com.bvan.javastart.lesson6.practice_analyze;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class Cakes4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter cakes: ");
        int cakes = scanner.nextInt();

        System.out.print("Enter border cake: ");
        int borderCake = scanner.nextInt();

        System.out.println("I have " + cakes + " cakes.");

        for (int cake = 1; cake <= cakes; cake++) {
            System.out.println("I have eaten " + cake + " cake.");

            if (cake > borderCake) {
                System.out.println("I'm feeling bad.");
            }
        }
    }
}
