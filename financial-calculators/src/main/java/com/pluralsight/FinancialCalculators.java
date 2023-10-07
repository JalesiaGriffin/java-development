package com.pluralsight;

import java.util.Scanner;

public class FinancialCalculators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        selectCalculator(scan);

    }

    public static void mortgageCalculator(Scanner scan) {
        //Prompt for mortgage details
        System.out.print("What is your principal amount? ");
        int principal = scan.nextInt();
        scan.nextLine();

        System.out.print("What is your interest rate? ");
        double interestRate = scan.nextDouble();
        interestRate = interestRate * 0.01;
        scan.nextLine();

        System.out.print("What is your loan length (in months)? ");
        int loanLength = scan.nextInt();
        scan.nextLine();

        //Calculations
        //double monthlyPayment = (principal * interestRate * ((1 + interestRate)^months)) / (((1 + interestRate)^months) - 1);
        double monthlyPayment = (principal * interestRate * Math.pow((1 + interestRate), loanLength) /
                Math.pow((1 + interestRate), loanLength) - 1);
        double totalInterest = (monthlyPayment * loanLength) - principal;

        System.out.println("A $" + principal + " loan at " + String.format("%.3f", (interestRate/0.01)) + "% interest for " +
                          loanLength/12 + " years would have a $" + String.format("%.2f",monthlyPayment) +
                          "/mo payment with a total interest of $" + String.format("%.2f", totalInterest));
    }

    public static void futureValue(Scanner scan) {
        //Prompt user for CD info
        System.out.print("Enter the deposit: ");
        int deposit = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter the interest rate: ");
        double interestRate = scan.nextDouble();
        interestRate = interestRate * 0.01;
        scan.nextLine();

        System.out.print("Enter the number of years: ");
        int yearNum = scan.nextInt();
        scan.nextLine();

        //Calculations
        //double futureValue = deposit * (Math.pow((1 + interestRate) , yearNum));


        double onePlusInterest = 1 + interestRate;

        double onePlusRaised = Math.pow(onePlusInterest, yearNum);

        double futureValue = onePlusRaised * deposit;

        double totalInterest = futureValue - deposit;

        //Output
        System.out.println("If you deposit $" + deposit + " in a CD that earns " +
                String.format("%.2f",(interestRate/0.01)) + "% interest and matures in " + yearNum +
                " years, your CD's ending balance will be $" + String.format("%.2f", futureValue) +
                " and you would have earned $" + String.format("%.2f", totalInterest) + " in interest");
    }

    public static void presentValue(Scanner scan) {
        // Prompt user for annuity info
        System.out.print("Enter the monthly payout: ");
        int monthlyPayout = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter the expected interest rate: ");
        double interestRate = scan.nextDouble();
        scan.nextLine();

        System.out.print("Enter the number of years to payout: ");
        int yearNum = scan.nextInt();
        scan.nextLine();

        // Calculations
        interestRate = interestRate * 0.01;
        //Present Value: presentValue = monthlyPayout * ((1 - (1 + interestRate)^(-years*12)) / interestRate)
        double presentValue = monthlyPayout * (1 - (Math.pow((1 + interestRate), (-yearNum * 12))) / interestRate);

        System.out.println(presentValue);
    }

    public static void selectCalculator(Scanner scan) {
        // Prompts
        System.out.println("Financial Calculators");
        System.out.println("\t(1) Mortgage Calculator");
        System.out.println("\t(2) Future Value");
        System.out.println("\t(3) Present Value");
        int selection = scan.nextInt();
        scan.nextLine();

        // Selection switch statement
        switch(selection) {
            case 1:
                mortgageCalculator(scan);
                break;
            case 2:
                futureValue(scan);
                break;
            case 3:
                presentValue(scan);
                break;
            default:
                System.out.println("Invalid response.");
        }

    }
}
