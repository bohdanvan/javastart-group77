package com.bvan.javastart.lesson8.value_storing.immutable_object;

/**
 * @author bvanchuhov
 */
public class StringStoring {

    public static void main(String[] args) {
        String s = "Hello";
        s = s.concat(", world");

        System.out.println(s);
    }
}
