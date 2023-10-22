package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class StoreApp {
    private static final HashMap<Integer, Product> inventory = new HashMap<>();

    public static void main(String[] args) {
        loadInventory();

        // create scanner object
        Scanner scan = new Scanner(System.in);

        // prompt user for item
        System.out.print("What item # are you interested in? ");
        int id = scan.nextInt();
        scan.nextLine();

        Product matchedProduct = inventory.get(id);
        if (matchedProduct == null) {
            System.out.println("We don't carry that product");
            return;
        }
        System.out.printf("We carry %s and the price is $%.2f",
                matchedProduct.getName(), matchedProduct.getPrice());
    }

    public static void loadInventory() {
        try {
            // open reader
            BufferedReader reader = new BufferedReader(new FileReader("inventory.csv"));
            String input;

            // read file
            while ((input = reader.readLine()) != null) {
                String[] tokens = input.split("\\|");
                String id = tokens[0];
                String name = tokens[1];
                float price = Float.parseFloat(tokens[2]);

                // create/add products
                Product product = new Product(id, name, price);
                inventory.put(id, product);
            }

            // close reader
            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
