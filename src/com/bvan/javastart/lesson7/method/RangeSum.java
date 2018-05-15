package com.bvan.javastart.lesson7.method;

/**
 * @author bvanchuhov
 */
public class RangeSum {

    public static void main(String[] args) {
        System.out.println(rangeSum(3, 1));
        System.out.println(rangeSum(1, 3)); // 6
        System.out.println(rangeSum(1, 100)); // 5050
    }

    public static int rangeSum(int from, int to) {
        if (from > to) {
            throw new IllegalArgumentException("from must be <= to");
        }

        int sum = 0;
        for (int n = from; n <= to; n++) {
            sum += n;
        }
        return sum;
    }
}
