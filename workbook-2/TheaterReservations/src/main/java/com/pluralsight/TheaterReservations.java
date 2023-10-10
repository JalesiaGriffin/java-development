package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DateTimeFormatter inputFormat;
        DateTimeFormatter formatter;

        //Prompts
        System.out.print("Please enter your name: ");
        String fullName = scan.nextLine();

        System.out.print("What date will you be  coming (MM/dd/yyyy): ");
        String userInputedDate = scan.nextLine();

        System.out.print("How many tickets would you like? ");
        int numOfTickets = scan.nextInt();

        // assigning variable values
        inputFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate reservationDate = LocalDate.parse(userInputedDate, inputFormat);
        String formattedDate = reservationDate.format(formatter);

        String firstName = fullName.substring(0, fullName.indexOf(" "));
        String lastName = fullName.substring(fullName.lastIndexOf(" ") + 1);

        //output
        if (numOfTickets > 1) {
            System.out.println(numOfTickets + " tickets for " + formattedDate + " under " + lastName + ", " + firstName);
        } else
            System.out.println(numOfTickets + " ticket for " + formattedDate + " under " + lastName + ", " + firstName);
    }
}
