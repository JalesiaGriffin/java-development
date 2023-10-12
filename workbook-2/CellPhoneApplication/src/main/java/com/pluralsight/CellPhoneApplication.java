package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        // Objects
        Scanner scan = new Scanner(System.in);
        CellPhone cellPhone1 = new CellPhone();
        CellPhone cellPhone2 = new CellPhone();

        getPhoneProperties(scan, cellPhone1);
        display(cellPhone1);
        
        getPhoneProperties(scan, cellPhone2);
        display(cellPhone2);

        cellPhone1.dial(cellPhone2.getPhoneNum());
        cellPhone2.dial(cellPhone1.getPhoneNum());
    }
    public static void getPhoneProperties (Scanner scan, CellPhone phone) {
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
        phone.setSerialNum(serial);
        phone.setModel(model);
        phone.setCarrier(carrier);
        phone.setPhoneNum(phoneNum);
        phone.setOwner(owner);
    }
    public static void display(CellPhone phone) {
        // Print values
        System.out.println("\nSerial Number: " + phone.getSerialNum());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNum());
        System.out.println("Owner: " + phone.getOwner());
    }
}
