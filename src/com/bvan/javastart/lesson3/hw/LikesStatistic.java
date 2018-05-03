package com.bvan.javastart.lesson3.hw;

/**
 * @author bvanchuhov
 */
public class LikesStatistic {

    public static void main(String[] args) {
        long likesCount = 1; // Input: any valid number of likes
        int registrationYear = 2017; // Input: any valid registration year
        int currentYear = java.time.Year.now().getValue();

        double likesPerYear = (double) likesCount / (currentYear - registrationYear + 1); // Your formula

        System.out.println(likesPerYear + " likes / year");
    }
}