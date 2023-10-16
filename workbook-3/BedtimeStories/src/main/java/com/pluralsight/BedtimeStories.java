package com.pluralsight;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        // Keyboard scanner
        Scanner scan = new Scanner(System.in);

        // Prompt user for story name
        System.out.print("Enter story name: ");
        String storyChoice = scan.nextLine();

        try {
            // Create FileInputStream
            FileInputStream fis = new FileInputStream(storyChoice);
            Scanner file = new Scanner(fis);

            // Read file
            int lineCount = 1;
            String input;

            while(file.hasNextLine()) {
                input = file.nextLine();
                System.out.println(lineCount + ". " + input);
                lineCount++;
            }

            // Close scanners
            scan.close();
            file.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }
}
