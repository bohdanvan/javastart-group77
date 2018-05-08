package com.bvan.javastart.lesson5.hw;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class DayOfWeek {

    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day (1..7): ");
        int day = scanner.nextInt(); // Ctrl + Alt + V

        // BL
//        String dayType;
//        if (day <= 5) {
//            dayType = "weekday";
//        } else {
//            dayType = "weekend";
//        }

        String dayType = (day <= 5) ? "weekday" : "weekend";

        // Output
        System.out.println(dayType);
    }
}
