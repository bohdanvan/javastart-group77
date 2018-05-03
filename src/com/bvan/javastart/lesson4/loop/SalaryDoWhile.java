package com.bvan.javastart.lesson4.loop;

/**
 * @author bvanchuhov
 */
public class SalaryDoWhile {

    public static void main(String[] args) {
        long salary = 15000;

        do {
            System.out.println("Work. My salary is " + salary);
            salary += 1000;
        } while (salary < 10000);

        System.out.println("Stop!!!");
    }
}
