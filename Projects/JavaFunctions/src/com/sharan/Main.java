package com.sharan;

public class Main {

    public static void main(String[] args) {
        Numbers ntest = new Numbers();
        System.out.println("10 is prime: " + ntest.isPrime(10));
        System.out.println("5 is prime: " + ntest.isPrime(5));
        System.out.println("LCM of 534 and 343: "+ntest.lcm(534, 343));
    }
}