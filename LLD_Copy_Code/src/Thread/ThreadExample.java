package Thread;
import java.util.*;

//package ThreadExample; // Corrected the package name

import java.util.Scanner;

class Account {
    private int bal;

    public Account(int bal) {
        this.bal = bal;
    }

    public boolean isSufficientBalance(int w) {
        return bal > w;
    }

    public void withdraw(int amt) { // Corrected the method name
        bal = bal - amt;
        System.out.println("Withdrawn money is " + amt); // Corrected the spelling of "withdraw"
        System.out.println("Your current balance is " + bal);
    }
}

class Customer implements Runnable {
    private String name;
    private Account account;

    public Customer(Account account, String n) {
        this.account = account;
        name = n;
    }

    public void run() {
        Scanner kb = new Scanner(System.in);
        System.out.println(name + " Enter amount to withdraw");
        int amt = kb.nextInt();
        if (account.isSufficientBalance(amt)) {
            System.out.println(name);
            account.withdraw(amt); // Corrected the method name
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

public class ThreadExample {
    private static final String Simran = "Simran"; // Added the missing quotes
    private static final String Raj = "Raj"; // Added the missing quotes

    public static void main(String[] args) {
        Account a1 = new Account(1000);
        Customer c1 = new Customer(a1, Raj), c2 = new Customer(a1, Simran);
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();
    }
}
