package com.sharan;

public class ForLoops {
    public static void main(String[] args) {
        System.out.println("10000 at 1% interest = "+calculateInterest(10000.0d,1.0d));
        // For loops
        for(int i = 2; i < 9; i++){
            System.out.println("10000 at "+i+"% interest = "+String.format("%.2f",calculateInterest(10000d,i)));
        }
        System.out.println("-----");
        for(int i = 8; i > 1; i--){
            System.out.println("10000 at "+i+"% interest = "+String.format("%.2f",calculateInterest(10000d,i)));
        }
        System.out.println(isPrime(7));
        System.out.println(isPrime(6));
        //While loops
    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100d));
    }
    public static boolean isPrime(int n){
        if (n == 1){
            return false;
        }
        for (int i = 2; i < n/2;i++){
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    // For loops are very important but printing can spam output
    // While loops can be used
}
