package com.pluralsight;

import com.pluralsight.db.ShipperDao;
import org.apache.commons.dbcp2.BasicDataSource;

import java.util.Scanner;


public class NorthwindShippersApplication {
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("User and password are needed");
            System.exit(1);
        }

        String username = args[0];
        String password = args[1];

        BasicDataSource northwindDataSource = new BasicDataSource();
        northwindDataSource.setUrl("jdbc:mysql://localhost:3306/northwind");
        northwindDataSource.setUsername(username);
        northwindDataSource.setPassword(password);

        ShipperDao shipperDao = new ShipperDao(northwindDataSource);
        Scanner scan = new Scanner(System.in);

        addShipper(scan, shipperDao);
        updateShipper(scan, shipperDao);
        deleteShipper(scan, shipperDao);
    }

    public static void addShipper(Scanner scan, ShipperDao shipperDao){
        // Prompt user for new Shipper
        System.out.print("Enter Shipper name: ");
        String name = scan.nextLine();

        System.out.print("Enter Shipper phone number: ");
        String phone = scan.nextLine();

        shipperDao.addShipper(name, phone);
    }

    public static void updateShipper(Scanner scan, ShipperDao shipperDao){
        // Prompt user to change phone number
        System.out.println("\nChange Phone Number");
        System.out.print("Enter Shipper Id: ");
        int shipperId = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter Shipper phone number: ");
        String phoneNum = scan.nextLine();

        shipperDao.updateShipper(shipperId, phoneNum);
    }

    public static void deleteShipper(Scanner scan, ShipperDao shipperDao){
        // Prompt user to delete Shipper
        System.out.print("\nDelete Shipper (by name): ");
        String name = scan.nextLine();

        shipperDao.deleteShipper(name);
    }
}
