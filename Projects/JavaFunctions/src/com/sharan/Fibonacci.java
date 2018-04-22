package com.sharan;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;


public final class Fibonacci {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println("Answer: " + fibonacci(n));
        System.out.println("Enter another number: ");
        n = scanner.nextInt();
        BigInteger[] array = fibonacciList(n);
        printArray(array);
        System.out.println("Enter integer for the slower fibonacci algorithm: ");
        long j = scanner.nextLong();
        System.out.println("Answer from simple fibonacci: " + simpleFibonacci(j));

    }

    /*
     * Computes nth fibonacci number
     * */
    private static BigInteger fibonacci(int n) {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        int m = 0;
        for (int bit = Integer.highestOneBit(n); bit != 0; bit >>>= 1) {
            // Double it
            BigInteger d = multiply(a, b.shiftLeft(1).subtract(a));
            BigInteger e = multiply(a, a).add(multiply(b, b));
            a = d;
            b = e;
            m *= 2;
            // Advance by one conditionally
            if ((n & bit) != 0) {
                BigInteger c = a.add(b);
                a = b;
                b = c;
                m++;
            }
        }
        return a;
    }

    private static long simpleFibonacci(long n) {
        ArrayList<Long> f = new ArrayList<Long>();
        f.add(0l);
        f.add(1l);
        for (int i = 2; i < n + 1; i++) {
            f.add(i, (long) f.get(i - 1) + f.get(i - 2));

        }
        int fn = (int) (long) n;
        return f.get(fn);
    }

    // Multiplies two BigIntegers
    private static BigInteger multiply(BigInteger x, BigInteger y) {
        return x.multiply(y);
    }

    public static BigInteger[] fibonacciList(int n) {
        BigInteger[] returnArray = new BigInteger[n + 1];
        returnArray[0] = BigInteger.ZERO;
        returnArray[1] = BigInteger.ONE;
        for (int i = 2; i < returnArray.length; i++) {
            returnArray[i] = fibonacci(i);
        }
        return returnArray;
    }

    public static void printArray(BigInteger[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", Value: " + array[i]);
        }
    }

}
