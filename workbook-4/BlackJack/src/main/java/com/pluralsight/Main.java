package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt player name
        System.out.print("Enter Player 1: ");
        String p1 = scan.nextLine();

        System.out.print("Enter Player 2: ");
        String p2 = scan.nextLine();

        // Create deck
        Deck deck = new Deck();
        deck.shuffle();

        // Player points
        int p1Points = 0;
        int p2Points = 0;

        // Deal cards
        Hand p1Hand = new Hand();
        p1Hand.Deal(deck.deal());
        p1Hand.Deal(deck.deal());
        p1Points = p1Hand.getValue();

        Hand p2Hand = new Hand();
        p2Hand.Deal(deck.deal());
        p2Hand.Deal(deck.deal());
        p2Points = p2Hand.getValue();

        // Show Hand
        System.out.println("\n" + p1);
        p1Hand.Print();
        System.out.println("Points: " + p1Points);

        System.out.println("\n" + p2);
        p2Hand.Print();
        System.out.println("Points: " + p2Points);

        // Winner selection
        if (p1Points == p2Points){
            System.out.println("\nIt's a draw");
        }
        else if (p1Points > p2Points) {
            System.out.println("\nThe winner is " + p1);
        }
        else {
            System.out.println("\nThe winner is " + p2);
        }

    scan.close();
    }
}