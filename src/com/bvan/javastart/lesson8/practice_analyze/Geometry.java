package com.bvan.javastart.lesson8.practice_analyze;

/**
 * @author bvanchuhov
 */
public class Geometry {

    public static void main(String[] args) {
        System.out.println(rectangleArea(1, -10));
        System.out.println(rectangleArea(10, 20)); // 200
        System.out.println(rectangleArea(30, 40)); // 1200

        System.out.println(circleArea(10)); // 314.1592653589793
        System.out.println(circleArea(20));
    }

    public static double rectangleArea(double width, double height) {
        if (width <= 0) {
            throw new IllegalArgumentException("width must be > 0: " + width);
        }
        if (height <= 0) {
            throw new IllegalArgumentException("height must be > 0: " + height);
        }
        return width * height;
    }

    public static double circleArea(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("radius must be > 0: " + radius);
        }
        return Math.PI * Math.pow(radius, 2);
    }
}

