package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        // Create Objects
        Scanner scan = new Scanner(System.in);
        String[] quotes = new String[10];

        // Add 10 qoutes
        quotes[0] = "I’m ready, I’m ready.";
        quotes[1] = "Is mayonnaise an instrument?";
        quotes[2] = "The inner workings of my mind are an enigma.";
        quotes[3] = "Wake me up when I care.";
        quotes[4] = "Goodbye everyone, I’ll remember you all in therapy.";
        quotes[5] = "It’s not always what you say that matters, sometimes it’s what you don’t say";
        quotes[6] = "Home is where you’re surrounded by other critters that care about you.";
        quotes[7] = "I’m not a baby, I’m a man… with a baby’s brain.";
        quotes[8] = "I don’t need it, I don’t need it, I don’t need it, I don’t need it.";
        quotes[9] = "Too bad SpongeBob’s not here to enjoy Spongebob not being here.";

        try {
            while (true) {
                // Prompt user for number
                System.out.print("Enter a number between 1 and 10: ");
                int userNum = scan.nextInt();
                scan.nextLine();

                // Print quote
                System.out.println(quotes[userNum]);

                // Prompt user for another quote
                System.out.println("Would you like to select another quote?");
                String selectAnotherQuote = scan.nextLine();

                // Condition
                    if (selectAnotherQuote.equalsIgnoreCase("No")) {
                        return;
                    } else continue;
            }
        } catch (Exception e) {
            System.out.println("Your number was out of range!");
            e.printStackTrace();
        }
    }
}
