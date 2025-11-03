package com.pluralsight;

import com.pluralsight.Finance.BankAccount;
import com.pluralsight.Finance.Portfolio;
import com.pluralsight.Finance.Valuable;

import java.util.Scanner;

public class FinanceApplication {
    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Batman", "Pam", 12500);
        Valuable account2 = new BankAccount("Ironman", "Gary", 1500);
// try to deposit money into both accounts
        account1.deposit(100);
        ((BankAccount) account2).deposit(100);


    }

    public void menu() {
        System.out.println("==== welcome to your portfolio master wayne ===");
        System.out.println("Enter your name(owner)");
        String owner = scan.nextLine();

        Portfolio portfolio = new Portfolio("The Wayne estate inheritor", owner);
        displaymenu();
    }

    public void displaymenu() {

        boolean run = true;
        while (run){
            System.out.println("=== PORTFOLIO MENU ===");
            System.out.println("1 - Add House");
            System.out.println("2 - Add Bank Account");
            System.out.println("3 - Add Jewelry");
            System.out.println("4 - Add Credit Card");
            System.out.println("5 - View Portfolio");
            System.out.println("6 - Quit");
            int choice = scan.nextInt();
            scan.nextLine();
            switch (choice){

            }
        }
    }
}
