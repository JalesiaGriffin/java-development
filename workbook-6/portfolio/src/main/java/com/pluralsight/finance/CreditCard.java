package com.pluralsight.finance;

public class CreditCard implements IValuable{
    private String name;
    private String accountNumber;
    private double balance;

    public CreditCard(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void charge(double amount){
        balance -= amount;
    }

    public void pay(double amount){
        balance += balance;
    }

    @Override
    public double getValue() {
        return -balance;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
