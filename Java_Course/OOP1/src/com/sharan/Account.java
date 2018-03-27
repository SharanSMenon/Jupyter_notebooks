package com.sharan;

public class Account {
    public String id;
    public double balance;
    public String name;
    public String email;
    public String phone;
    public Account(String id, double balance, String name, String email, String phone) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.email = email;
        this.phone = phone;
    }
    public Account(){
        System.out.println("Set all fields manually.");
    }
    //Constructors can be overloaded.
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }
    //Email
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    //Name

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    //PN

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }
    public void deposit(double amount){
        this.balance += amount;
        System.out.println("Successful deposited $"+amount);
    }
    public void withdraw(double amount){
        if (amount < this.balance){
            this.balance -= amount;
            System.out.println("Successful withdrew $"+amount);
        }else{
            System.out.println("Not enough balance");
        }
    }
}
