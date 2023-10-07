package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        //Variables
        Scanner scan = new Scanner(System.in);
        double regularPrice = 5.45;
        double largePrice = 8.95;
        int age;
        int selection;

        //Prompt
        System.out.print("Select sandwich size (1 for Regular, 2 for Large): ");
        selection = scan.nextInt();
        scan.nextLine();

        System.out.print("How old are you? ");
        age = scan.nextInt();
        scan.nextLine();

        //Condition
        if ((selection == 1) && (age <= 17)) {
            System.out.println("Cost: $" + ());
        }
    }
}
