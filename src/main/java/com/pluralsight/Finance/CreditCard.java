package com.pluralsight.Finance;

public class CreditCard implements Valuable{
    private String name, accountNumber;
    private double balance;

    public CreditCard(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public double getValue() {
        return 0;
    }
    public void charge(double amount){

    }
    public void pay(double amount){

    }
}
