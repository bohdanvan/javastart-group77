package com.bvan.javastart.lesson7.method;

/**
 * @author bvanchuhov
 */
public class LastChar {

    public static void main(String[] args) {
        System.out.println(lastChar("Java"));
        System.out.println(lastChar("X"));

//        System.out.println(lastChar(""));
    }

    public static char lastChar(String s) {
        if (s.isEmpty()) {
            throw new IllegalArgumentException("can't get last char in an empty string");
        }

        return s.charAt(s.length() - 1);
    }
}
