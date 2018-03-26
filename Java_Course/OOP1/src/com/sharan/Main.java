package com.sharan;

//import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Car bugatti = new Car();
        Car lamborghini = new Car();
//        System.out.println(bugatti.price);
        bugatti.setModel("Veyron");
        System.out.println("Bugatti model is "+bugatti.getModel());
    }
}
