package com.sharan;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        System.out.println("10 is prime: " + Numbers.isPrime(10));
        System.out.println("5 is prime: " + Numbers.isPrime(5));
        System.out.println("LCM of 534 and 343: "+Numbers.lcm(534, 343));
        System.out.println("The 54th fibonacci number: " + Fibonacci.fibonacci(54));
        System.out.println("Law of cosines for a = 5, b = 4, and C = 60: " + Numbers.lawOfCosinesNormal(5,4,60));
        System.out.println("Calculating C with law of cosines when a = 5, b = 4, and c = 6: "+  Numbers.lawOfCosinesGamma(5,4,6));
        BigInteger[] fibList = Fibonacci.fibonacciList(10);
        System.out.println("The first 10 fibonacci numbers: ");
        Fibonacci.printArray(fibList);
    }
}