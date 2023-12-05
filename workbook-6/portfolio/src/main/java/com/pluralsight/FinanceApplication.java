package com.pluralsight;

import com.pluralsight.finance.*;
import com.pluralsight.finance.IValuable;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Pam","123",  12500);
        IValuable account2 = new BankAccount("Gary","456",  1500);

        // try to deposit money into both accounts
        account1.deposit(100);

        BankAccount account21 = (BankAccount) account2;
        account21.deposit(100);

        // add assets to portfolio
        Portfolio portfolio = new Portfolio("My Assets","Gary");
        portfolio.add(new House("condo",4000, 2019, 3500, 6));
        portfolio.add(new Gold("my gold", 5000, 600));
        portfolio.add(new Jewelry("Ruby", 17000, 60));
        portfolio.add(new CreditCard("company", "12345", 17956));

        System.out.println(portfolio.getLeastValuable());
    }
}
