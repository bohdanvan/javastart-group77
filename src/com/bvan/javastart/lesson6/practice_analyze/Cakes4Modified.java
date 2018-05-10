package com.bvan.javastart.lesson6.practice_analyze;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class Cakes4Modified {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter cakes: ");
        int cakes = scanner.nextInt();

        System.out.print("Enter border cake: ");
        int borderCake = scanner.nextInt();

        System.out.println("I have " + cakes + " cakes.");

        int petyaCakes = Math.min(borderCake, cakes);
        for (int cake = 1; cake <= petyaCakes; cake++) {
            System.out.println("I have eaten " + cake + " cake.");
        }
    }
}
