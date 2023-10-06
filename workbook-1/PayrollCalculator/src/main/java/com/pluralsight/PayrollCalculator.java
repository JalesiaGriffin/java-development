package com.pluralsight;

import java.util.Scanner;
public class PayrollCalculator {
    public static void main(String[] args) {
        //Variables
            Scanner scan = new Scanner(System.in);
            String name;
            float hoursWorked;
            float payRate;
            float grossPay;

        //Prompts
            System.out.print("Hi, what is your First and Last name? ");
            name = scan.next();
            scan.nextLine();

            System.out.print("How many hours have you worked? ");
            hoursWorked = scan.nextFloat();
            scan.nextLine();

            System.out.print("What is your pay rate? ");
            payRate = scan.nextFloat();
            scan.nextLine();

        //Conditions
            if (hoursWorked > 40) {
                    grossPay = (1.5f * (payRate * hoursWorked));
            }
            else {
                    grossPay = payRate * hoursWorked;
            }

        //Output
            System.out.println("Employee Name: " + name + "\nGross Pay: " + grossPay);
    }
}
