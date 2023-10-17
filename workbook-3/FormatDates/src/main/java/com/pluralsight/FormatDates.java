package com.pluralsight;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {
        // Get date, time, and timezone
        LocalDate date = LocalDate.now();
        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));

        // Create formatters
        DateTimeFormatter dateFormatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("EEEE dd, yyyy");
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy hh:mm");

        // Format
        String date2 = date.format(dateFormatter1);
        String date3 = date.format(dateTimeFormatter2);
        String dateAndTime = gmt.format(fmt);

        // Print
        System.out.println(date2);
        System.out.println(date);
        System.out.println(date3);
        System.out.println(dateAndTime);
    }
}
