package com.pluralsight;

import com.pluralsight.Finance.BankAccount;
import com.pluralsight.Finance.Portfolio;
import com.pluralsight.Finance.Valuable;

import java.util.Scanner;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Batman", "Pam", 12500);
        Valuable account2 = new BankAccount("Ironman", "Gary", 1500);
// try to deposit money into both accounts
        account1.deposit(100);
        ((BankAccount) account2).deposit(100);

        Scanner scan = new Scanner(System.in);


        System.out.println("Enter your name(owner)");
        String owner = scan.nextLine();

        Portfolio portfolio = new Portfolio("The Wayne estate inheritor",owner);



    }


}
