package com.pluralsight;

import java.util.Scanner;
public class FullNameGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt
        System.out.println("Please enter your name");
        System.out.print("First name: ");
        String firstName = scan.nextLine();

        System.out.print("Middle name (or press enter): ");
        String middleName = scan.nextLine();

        System.out.print("Last name: ");
        String lastName = scan.nextLine();

        System.out.println("Suffix (or press enter): ");
        String suffix = scan.nextLine();

        // Conditions
        if (middleName.equals("") && suffix.equals("")) {
            System.out.println("Full name: " + firstName + " " + lastName);
        } else if (middleName.equals("")) {
            System.out.println("Full name: " + firstName + " " + lastName + ", "+ suffix);
        } else if (!middleName.equals("") && suffix.equals("")) {
            System.out.println("Full name: " + firstName + " " + middleName.charAt(0) + ". " + lastName);
        } else {
            System.out.println("Full name: " + firstName + " " + middleName.charAt(0) + ". " + lastName + ", " + suffix);
        }
    }
}
