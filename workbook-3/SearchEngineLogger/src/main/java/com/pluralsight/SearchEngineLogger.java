package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SearchEngineLogger {
    private static String LOG_FILE_NAME = "logs.txt";
    public static void main(String[] args) {
        try {
            // Create scanner, writer, datetime, and formatter
            Scanner scan = new Scanner(System.in);
            BufferedWriter writer = new BufferedWriter(new FileWriter(LOG_FILE_NAME));
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
            LocalDateTime dt = LocalDateTime.now();
            String dateTime = dt.format(fmt);

            // launch loge file
            writer.write(dateTime + "launch\n");

            while (true) {
                // Prompt user
                System.out.print("Enter a search term (X to exit): ");
                String query = scan.nextLine();
                writer.write(dateTime + " search : " + query + "\n");
                // log actions
                if (query.equalsIgnoreCase("X")) {
                    writer.write(dateTime + " exit");

                    return;
                }
            }
/*            scan.close();
            writer.close();*/
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
