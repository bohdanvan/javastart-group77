package com.bvan.javastart.lesson4.condition;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class IPhoneBuying {

    public static void main(String[] args) {
        long iPhonePrice = 999;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter money: ");
        long money = scanner.nextLong();

        System.out.print("Are you happy? (y/n): ");
        boolean isHappy = scanner.next().equals("y");

        System.out.print("Does your girlfriend want? (y/n): ");
        boolean girlfriendWants = scanner.next().equals("y");

        if ((girlfriendWants || isHappy) && money >= iPhonePrice) {
            System.out.println("Yahoooo, buy iPhone");
            money -= iPhonePrice;
        } else {
            System.out.println("Sadly :(");
        }

        System.out.println("$" + money + " left");
    }
}
