package com.sharan;

//import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Car bugatti = new Car();
        Car lamborghini = new Car();
//        System.out.println(bugatti.price);
        bugatti.setModel("Veyron");
        System.out.println("Bugatti model is "+bugatti.getModel());
        Account test = new Account();
        test.setBalance(50d);
        test.setPhone("443-315-7862");
        test.setName("Testman");
        test.setEmail("sharansajivmenon@gmail.com");
        test.deposit(51d);
        test.withdraw(100d);
        System.out.println("Balance is now "+test.getBalance());

    }
}
