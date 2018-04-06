package com.sharan;

public class Numbers {
    public Numbers() {
        System.out.println("Use the methods provided by this class");
    }

    public boolean isEven(int x) {
        return x % 2 == 0;
    }

    public boolean isOdd(int x) {
        return x % 2 == 1;
    }

    public boolean isPrime(int x) {
        for (int i = 2; i < x / 2; i++) {
            if (i % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public double 
}
