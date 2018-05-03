package com.bvan.javastart.lesson4.loop;

/**
 * @author bvanchuhov
 */
public class SalaryWhile {

    public static void main(String[] args) {
        long salary = 600; // (1)

        while (salary < 10000) { // (2)
            System.out.println("Work. My salary is " + salary);
            salary += 1000; // (3)
        }

        System.out.println("Stop!!!");
    }
}
