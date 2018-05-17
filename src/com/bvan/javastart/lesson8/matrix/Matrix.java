package com.bvan.javastart.lesson8.matrix;

/**
 * @author bvanchuhov
 */
public class Matrix {

    public static void main(String[] args) {
        int[][] board = new int[3][3];

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7},
                {8, 9, 10, 11}
        };

        int elem = matrix[2][1];
        System.out.println(elem);
    }
}
