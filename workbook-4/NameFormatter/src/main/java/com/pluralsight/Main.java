package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        String name1 = NameFormatter.format("Mel", "Johnson");
        System.out.println(name1);

        String name2 = NameFormatter.format("", "Mel", "Blenda", "Johnson", "PHD");
        System.out.println(name2);

        String name3 = NameFormatter.format("Mel B Johnson, PhD");
        System.out.println(name3);
    }
}
