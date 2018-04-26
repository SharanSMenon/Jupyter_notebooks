package com.sharan;

public class Numbers {
    /**
     * To make sure that this cannot be initialized.
     */
    private Numbers() {
    }

    /**
     * Checks if number is even
     *
     * @param x
     * @return
     */
    public static boolean isEven(int x) {
        return x % 2 == 0;
    }

    /**
     * Checks if number is odd
     *
     * @param x
     * @return
     */
    public static boolean isOdd(int x) {
        return x % 2 == 1;
    }

    /**
     * Checks if number is prime
     *
     * @param x
     */
    public static boolean isPrime(int x) {
        for (int i = 2; i < x / 2; i++) {
            if (i % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param a
     * @param b Uses recursion
     */
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        int ap = a % b;
        return gcd(b, ap);
    }

    /**
     * @param a
     * @param b
     * @return a * b / gcd of a and b
     */
    public static long lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    /**
     * @param a
     * @param b
     * @param C
     * @return length of side c
     */
    public static double lawOfCosinesNormal(double a, double b, double C) {
        C = Math.toRadians(C);
        return Math.sqrt(((Math.pow(a, 2) + Math.pow(b, 2)) - (2 * a * b * (Math.cos(C)))));
    }

    /**
     * @param a
     * @param b
     * @param c
     * @return C in degrees
     */
    public static double lawOfCosinesGamma(double a, double b, double c) {
        return Math.toDegrees(Math.acos(((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b))));
    }
}
