package com.pluralsight.Finance;

public class BankAccount implements Valuable{
private String name, accountNumber;
private double balance;

    public BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public double getValue() {
        return 0;
    }
    public void deposit(double amount){

    }
    public void withdraw(double amount){

    }
}
