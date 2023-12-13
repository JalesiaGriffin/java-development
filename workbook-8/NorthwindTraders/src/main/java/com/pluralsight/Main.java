package com.pluralsight;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner scan = new Scanner(System.in);
        if (args.length != 2) {
            System.out.println(
                    "Application needs two arguments to run: " +
                            "java com.pluralsight.UsingDriverManager <username> <password>");
            System.exit(1);
        }
        // get the user name and password from the command line args
        String username = args[0];
        String password = args[1];

        // load the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        menu(username, password, scan);
    }

    public static void menu(String userName, String password, Scanner scan) {
        boolean running = true;
        String userChoice = null;
        String category = null;

        while (running) {
            System.out.println("\t1) Display all products");
            System.out.println("\t2) Display all customers");
            System.out.println("\t3) Display all categories");
            System.out.println("\t0) Exit");
            System.out.print("What do you want to do? ");
            userChoice = scan.nextLine();

            switch (userChoice) {
                case "1" -> displayAllProducts(userName, password);
                case "2" -> displayAllCustomers(userName, password);
                case "3" -> {
                    displayAllCategories(userName, password);
                    System.out.println("Select a category: ");
                    category = scan.nextLine();
                    displayProductsOfSelectedCategory(userName, password, category);
                }
                case "0" -> running = false;
                default -> System.out.println("invalid response");
            }
        }
    }

    public static void displayAllProducts(String username, String password) {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/northwind",
                username,
                password
        );

             PreparedStatement preparedStatement = connection.prepareStatement(
                     """
                              SELECT p.productid, p.productname, p.unitprice, p.unitsinstock 
                              FROM products p
                             """
             );) {


            try (
                    ResultSet resultSet = preparedStatement.executeQuery();
            ) {

                while (resultSet.next()) {
                    // process the data
                    System.out.printf("Product Id: %s\n" +
                                    "Name: %s\n" +
                                    "Price: %s\n" +
                                    "Stock: %s\n\n",
                            resultSet.getInt(1),
                            resultSet.getString(2),
                            resultSet.getDouble(3),
                            resultSet.getInt(4));
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void displayAllCustomers(String username, String password) {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/northwind",
                username,
                password
        );

             PreparedStatement preparedStatement = connection.prepareStatement(
                     """
                            SELECT c.contactname, c.companyname, c.city, c.country, c. phone 
                            FROM customers c 
                            ORDER BY country
                            """
             );) {


            try (
                    ResultSet resultSet = preparedStatement.executeQuery();
            ) {

                while (resultSet.next()) {
                    // process the data
                    System.out.printf("Contact Name: %s\n" +
                                    "Company Name: %s\n" +
                                    "City: %s\n" +
                                    "Country: %s\n" +
                                    "Phone: %s\n\n",
                            resultSet.getString(1),
                            resultSet.getString(2),
                            resultSet.getString(3),
                            resultSet.getString(4),
                            resultSet.getString(5));
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void displayAllCategories(String username, String password){
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/northwind",
                username,
                password
        );

             PreparedStatement preparedStatement = connection.prepareStatement(
                     """
                              SELECT c.categoryid, c.categoryname 
                              FROM categories c 
                              ORDER BY c.categoryid
                             """
             );) {


            try (
                    ResultSet resultSet = preparedStatement.executeQuery();
            ) {

                while (resultSet.next()) {
                    // process the data
                    System.out.printf("Category ID: %s\n" +
                                    "Category Name: %s\n\n",
                            resultSet.getInt(1),
                            resultSet.getString(2));
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void displayProductsOfSelectedCategory(String username, String password, String category){
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/northwind",
                username,
                password
        );

             PreparedStatement preparedStatement = connection.prepareStatement(
                     """
                              SELECT p.productid, p.productname, p.unitprice, p.unitsinstock 
                                   FROM products p 
                                   JOIN categories c ON p.categoryid = c.categoryid 
                                   WHERE c.categoryname LIKE ?; 
                             """
             );) {

            preparedStatement.setString(1, category);

            try (
                    ResultSet resultSet = preparedStatement.executeQuery();
            ) {

                while (resultSet.next()) {
                    // process the data
                    System.out.printf("Product Id: %s\n" +
                                    "Name: %s\n" +
                                    "Price: %s\n" +
                                    "Stock: %s\n\n",
                            resultSet.getInt(1),
                            resultSet.getString(2),
                            resultSet.getDouble(3),
                            resultSet.getInt(4));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}