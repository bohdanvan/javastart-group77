package com.bvan.javastart.lesson6.practice_analyze;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class Cakes2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter cakes: ");
        int cakes = scanner.nextInt();

        System.out.println("I have " + cakes + " cakes.");

        for (int cakesLeft = cakes - 1; cakesLeft >= 0; cakesLeft--) {
            System.out.println("I have eaten a cake. " + cakesLeft + " are left.");
        }
    }
}
