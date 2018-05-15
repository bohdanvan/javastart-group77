package com.bvan.javastart.lesson7.method;

/**
 * @author bvanchuhov
 */
public class AgeChecker {

    public static void main(String[] args) {
        System.out.println(isAge(20)); // true
        System.out.println(isAge(-100)); // false
        System.out.println(isAge(200)); // false
    }

    public static boolean isAge(int n) {
        return n >= 1 && n <= 120;
    }
}
