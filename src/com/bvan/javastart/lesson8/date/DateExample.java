package com.bvan.javastart.lesson8.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author bvanchuhov
 */
public class DateExample {

    public static void main(String[] args) {
        // Date - old class

        // Java 8 (2013)
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        System.out.println();

        LocalDate now = LocalDate.now();
        LocalDate nowYearAgo = now.minusYears(1);
        DayOfWeek dayOfWeek = nowYearAgo.getDayOfWeek();

        System.out.println(now);
        System.out.println(nowYearAgo);
        System.out.println(dayOfWeek);
        System.out.println(dayOfWeek.getValue());
        System.out.println();

        LocalDate elvisBirthDate = LocalDate.of(1935, 1, 8);
        System.out.println(elvisBirthDate.isLeapYear());

        System.out.println(LocalDate.of(1, 1, 1).getDayOfWeek());
    }
}
