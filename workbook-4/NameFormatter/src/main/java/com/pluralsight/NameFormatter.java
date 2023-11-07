package com.pluralsight;

public class NameFormatter {
    private NameFormatter(){}
    public static String format(String firstName, String lastName) {
        return String.format("%1s, %1s", lastName, firstName);
    }

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {
        String name;
        if (prefix.equals("")) {
            name = String.format("%1s, %1s %1s, %1s ", lastName, firstName, middleName.charAt(0), suffix);
        } else if (prefix.equals("") && suffix.equals("") && middleName.equals("")) {
            name = format(firstName, lastName);
        } else {
          name = String.format("%1s, %1s %1s %1s, %1s ", lastName, prefix, firstName, middleName.charAt(0), suffix);
        }
    return name;
    }

    public static String format (String fullName) {
        String[] nameParts = fullName.split(" ");
        String name = "";

        if (nameParts.length == 2) {
            String firstName = nameParts[0];
            String lastName = nameParts[1];

            name = format(firstName, lastName);
        }
        if (nameParts.length == 4) {
            String firstName = nameParts[0];
            String middleName = nameParts[1];
            String lastName = nameParts[2].substring(0, nameParts[2].length() - 1);
            String suffix = nameParts[3];

            name = format("", firstName, middleName, lastName, suffix);
        }
        if (nameParts.length == 5) {
            String prefix = nameParts[0];
            String firstName = nameParts[1];
            String middleName = nameParts[2];
            String lastName = nameParts[2].substring(0, nameParts[2].length() - 1);
            String suffix = nameParts[4];

            name = format(prefix, firstName, middleName, lastName, suffix);
        }
        return name;
    }
}
