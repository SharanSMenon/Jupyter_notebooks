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

    /*
     * Efficient algorithm to compute GCD*/
    public int gcd(int a, int b) {
        if (b == 0){
            return a;
        }

        int ap = a % b;
        return gcd(b, ap);
    }

    public long lcm(int a, int b){
        return a * b / gcd(a, b);
    }
}
