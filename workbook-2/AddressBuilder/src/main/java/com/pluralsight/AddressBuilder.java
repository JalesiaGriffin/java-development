package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        // Create Objects
        StringBuilder address = new StringBuilder();
        Scanner scan = new Scanner(System.in);

        //Prompts and appends
        System.out.println("Please provide the following information:");
        System.out.print("Full name: ");
        address.append(scan.nextLine() + "\n\n");

        address.append("Billing Address:\n");   //billing address section
        System.out.print("Billing Street: ");
        address.append(scan.nextLine() + "\n");

        System.out.print("Billing City: ");
        address.append(scan.nextLine() + ", ");

        System.out.print("Billing State: ");
        address.append(scan.nextLine() + " ");

        System.out.print("Billing Zip: ");
        address.append(scan.nextLine());

        address.append("\n\nShipping Address:\n"); //shipping address section
        System.out.print("\nShipping Street: ");
        address.append(scan.nextLine() + "\n");

        System.out.print("Shipping City: ");
        address.append(scan.nextLine() + ", ");

        System.out.print("Shipping State: ");
        address.append(scan.nextLine() + " ");

        System.out.print("Shipping Zip: ");
        address.append(scan.nextLine());

        System.out.println(address);
    }
}
