package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StoreApp {
    public static void main(String[] args) {
    // Create Product ArrayList
    ArrayList<Product> inventory = getInventory();
    Collections.sort(inventory, Comparator.comparing(Product::getName));

    Scanner scan = new Scanner(System.in);

    homeScreen(scan, inventory);

    scan.close();
    }
    public static void homeScreen(Scanner scan, ArrayList<Product> inventory) {
        while (true) {
            System.out.println("\nWhat do you want to do?");
            System.out.println("(1) List all products");
            System.out.println("(2) Lookup a product by its id");
            System.out.println("(3) Find all products within a price range");
            System.out.println("(4) Add a new product");
            System.out.println("(5) Quit the application");
            System.out.print("\nPlease select an option: ");
            int selection = scan.nextInt();
            scan.nextLine();

            switch(selection) {
                case 1:
                    listAllProducts(inventory);
                    break;
                case 2:
                    productById(scan, inventory);
                    break;
                case 3:
                    productsWithinAPriceRange(scan, inventory);
                    break;
                case 4:
                    addNewProduct(scan, inventory);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid Response");
            }
        }
    }
    public static ArrayList<Product> getInventory() {
        // Create Product ArrayList
        ArrayList<Product> inventory = new ArrayList<Product>();

        try {
        // open buffered reader
        BufferedReader reader = new BufferedReader(new FileReader("inventory.csv"));
        String input = reader.readLine();

            // read file
            while((input = reader.readLine()) != null) {
                String[] tokens = input.split("\\|");
                int id = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                float price = Float.parseFloat(tokens[2]);

            // create/add products
            inventory.add(new Product(id, name, price));
            }

        // close reader
        reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    return inventory;
    }
    public static void listAllProducts(ArrayList<Product> inventory) {
        // Displays inventory
        System.out.println("\nAll Products:");

        for (Product p : inventory) {
            System.out.println(p);
        }
    }
    public static void productById(Scanner scan, ArrayList<Product> inventory) {
        System.out.println("\nSearch by Product ID");
        System.out.print("Enter product id: ");
        int id = scan.nextInt();

        for (Product product: inventory) {
            if (id == product.getId()) {
            System.out.println(product);
            return;
            }
        }
    }
    public static void productsWithinAPriceRange(Scanner scan, ArrayList<Product> inventory) {
        System.out.println("\nProducts within Price Range");
        System.out.print("Enter minimum price: ");
        float minPrice = scan.nextFloat();

        System.out.print("Enter maximum price: ");
        float maxPrice = scan.nextFloat();

        for (Product product: inventory) {
            if (product.getPrice() >= minPrice && product.getPrice() <= maxPrice) {
                System.out.println(product);
            }
        }
    }
    public static void addNewProduct(Scanner scan, ArrayList<Product> inventory) {
        System.out.println("\nAdd New Product");
        System.out.print("Enter Product ID: ");
        int id = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter Product Name: ");
        String name = scan.nextLine();

        System.out.print("Enter Product Price: ");
        float price = scan.nextFloat();

        inventory.add(new Product(id, name, price));
    }
}
