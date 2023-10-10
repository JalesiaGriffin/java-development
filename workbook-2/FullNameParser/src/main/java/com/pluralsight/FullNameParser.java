package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt
        System.out.print("Please enter your name: ");
        String input = scan.nextLine().trim();

        // Solution
        String[] fullName = input.split("\\ ");

        System.out.println("First name: " + fullName[0]);
        System.out.println("Middle name: " + fullName[1]);
        System.out.println("Last name: " + fullName[2]);
    }
}
