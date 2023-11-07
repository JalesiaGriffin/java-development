package com.pluralsight;

import java.io.*;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt user for file name to process and create
        System.out.print("Enter the name of the employee file to process: ");
        String employeeFileName = scan.nextLine();

        System.out.print("Enter the name of the payroll file to create: ");
        String payrollFileName = scan.nextLine();

        try {
            //Read the employee file
            BufferedReader reader = new BufferedReader(new FileReader(employeeFileName));
            BufferedWriter writer = new BufferedWriter(new FileWriter(payrollFileName));

            if (payrollFileName.endsWith(".json")) {
                writer.write("{\n");
            }

            String line;
            while ((line = reader.readLine()) != null) {

                String[] tokens = line.split("\\|");
                int id = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double hoursWorked = Double.parseDouble(tokens[2]);
                double payRate = Double.parseDouble(tokens[3]);

                Employee employee = new Employee(id, name, hoursWorked, payRate);

                // Conditions for .csv and .json formatting
                if (payrollFileName.endsWith(".json")) {
                    writer.write("{ id: " + id + ", ");
                    writer.write("name: " + name + ", ");
                    writer.write("grosspay: " + employee.getGrossPay() + " }, \n");

                 } else if (payrollFileName.endsWith(".csv")) {
                    writer.write(id + "|");
                    writer.write(name + "|");
                    writer.write(employee.getGrossPay() + "\n");
                }
            }
            writer.write("\n}");
            //close
            reader.close();
            writer.close();
            scan.close();
        } catch (IOException e) {
            System.err.println("Error reading file: " + employeeFileName);
            e.printStackTrace();
        }
    }
}
