package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> myAssets = new ArrayList<>();
        myAssets.add(new House("my house","01/01/2023", 450000, "abc", 2, 6000, 6));
        myAssets.add(new House("my other cooler house","01/01/2023", 250000, "xyz", 1, 3000, 4));
        myAssets.add(new Vehicle("Car","05/31/2022",27000,"Honda Accord", 2017, 75000));
        myAssets.add(new Vehicle("my motorcyle","05/31/2022",7000,"Kawasaki Z900", 2020, 500));
        String message = "";

        for (int i = 0; i < myAssets.size(); i++) {
            if (myAssets.get(i) instanceof House) {
                House house = (House) myAssets.get(i);
                message = "House at " + house.getAddress();
                System.out.println(message);
            } else if (myAssets.get(i) instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) myAssets.get(i);
                message = "Vehicle: " +
                        vehicle.getYear() + " " + vehicle.getMakeModel();
                System.out.println(message);
            }
        }
    }
}
