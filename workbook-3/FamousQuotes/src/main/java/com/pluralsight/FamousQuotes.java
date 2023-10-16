package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        // Create Objects
        Scanner scan = new Scanner(System.in);
        String[] quotes = new String[10];

        // create variables
        int min = 1;
        int max = 10;

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

        while (true) {
            try {
                // Prompt user to choose random quote or manual
                System.out.print("Would you like a random quote?");
                String quoteSelectionChoice = scan.nextLine();

                    if (quoteSelectionChoice.equalsIgnoreCase("Yes")){
                        int randomQuote = min + (int)(Math.random() * max);
                        System.out.println(quotes[randomQuote]);
                    } else {
                        System.out.print("Enter a number between 1 and 10: ");
                        int userNum = scan.nextInt();
                        scan.nextLine();

                        // Print quote
                        System.out.println(quotes[userNum]);
                    }

                // Prompt user for another quote
                System.out.println("Would you like to select another quote?");
                String selectAnotherQuote = scan.nextLine();

                // Condition to quit program or get another quote
                if (selectAnotherQuote.equalsIgnoreCase("No")) {
                    return;
                } else continue;

            } catch (Exception e) {
                System.out.println("Your number was out of range!");
                e.printStackTrace();

            }
        }
    }
}
