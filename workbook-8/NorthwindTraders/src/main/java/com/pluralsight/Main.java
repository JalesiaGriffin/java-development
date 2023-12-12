package com.pluralsight;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
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

        // create the connection and prepared statement
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/northwind", username, password);
        PreparedStatement preparedStatement =
                connection.prepareStatement(
                        """
                            SELECT p.productid, p.productname, p.unitprice, p.unitsinstock 
                            FROM products p
                            """);

        // execute the query
        ResultSet resultSet = preparedStatement.executeQuery();

        // loop thru the results
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

        // close the resources
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }
}
