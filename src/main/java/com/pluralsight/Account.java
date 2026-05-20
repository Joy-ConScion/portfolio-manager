package com.pluralsight;

public abstract class Account implements Valuable {

    String name;
    String accountNumber;
    double balance;

    public Account(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getValue() {
        return 0;
    }

}
