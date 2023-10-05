package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        //Variables
            float num1;
            float num2;
            String operation;
            Scanner scan = new Scanner(System.in);

        //Prompt
        System.out.print("Enter the first number: ");
        num1 = scan.nextFloat();
        scan.nextLine();

        System.out.print("Enter the second number: ");
        num2 = scan.nextFloat();
        scan.nextLine();

        System.out.println("Possible calculations:");
        System.out.print("\t(A)dd\n" +
                "\t(S)ubtract\n" +
                "\t(M)ultiply\n" +
                "\t(D)ivide\n" +
                "Please select an option: ");
        operation = scan.nextLine();

        //Conditions
            if (operation.equals("A")) {
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2)); //addition
            }
            else if (operation.equals("S")) {
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2)); //subtraction
            }
            else if (operation.equals("M")) {
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
            }
            else if (operation.equals("D")) {
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            }
            else
                System.out.println("Invalid response."); //invalidation
    }
}