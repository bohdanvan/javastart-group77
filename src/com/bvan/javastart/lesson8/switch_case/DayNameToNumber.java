package com.bvan.javastart.lesson8.switch_case;

/**
 * @author bvanchuhov
 */
public class DayNameToNumber {

    public static void main(String[] args) {
        String dayName = "Tueasdfsday";

        int dayNumber;
        switch (dayName) {
            case "Monday":
                dayNumber = 1;
                break;
            case "Tuesday":
                dayNumber = 2;
                break;
            default:
                dayNumber = -1;
        }

        System.out.println(dayNumber);
    }
}
