package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CellPhone myPhone = new CellPhone();

        // Prompts
        System.out.print("What is the serial number? ");
        int serial = scan.nextInt();
        scan.nextLine();

        System.out.print("What model is the phone? ");
        String model = scan.nextLine();

        System.out.print("Who is the carrier? ");
        String carrier = scan.nextLine();

        System.out.print("What is the phone number? ");
        String phoneNum = scan.nextLine();

        System.out.print("Who is the owner of the phone? ");
        String owner = scan.nextLine();

        // Set values
        myPhone.setSerialNum(serial);
        myPhone.setModel(model);
        myPhone.setCarrier(carrier);
        myPhone.setPhoneNum(phoneNum);
        myPhone.setOwner(owner);

        // Print values
        System.out.println("\nSerial Number: " + myPhone.getSerialNum());
        System.out.println("Model: " + myPhone.getModel());
        System.out.println("Carrier: " + myPhone.getCarrier());
        System.out.println("Phone Number: " + myPhone.getPhoneNum());
        System.out.println("Owner: " + myPhone.getOwner());
    }
}
