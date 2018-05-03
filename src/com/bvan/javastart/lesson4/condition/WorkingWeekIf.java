package com.bvan.javastart.lesson4.condition;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class WorkingWeekIf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day (1..7): ");
        int day = scanner.nextInt();

        if (day <= 5) {
            System.out.println("Work");
        } else {
            System.out.println("Friends");
        }

        if (day >= 4) {
            System.out.println("Football");
        }

        System.out.println("Java Courses");
    }
}
