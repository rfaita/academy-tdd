package com.academy.tests.bank;

public class BankAccount {

    private int balance;

    public void open() {
        this.balance = 0;
    }

    public int getBalance(){
        return balance;
    }

}