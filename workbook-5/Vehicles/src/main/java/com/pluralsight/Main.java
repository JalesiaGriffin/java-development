package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        //Moped
        Moped slowRide = new Moped("model1", "green", 60, 35, 2, 3,500);
        System.out.println(slowRide.getColor());
        System.out.println(slowRide.getFuelCapacity());

        //HoverCraft
        HoverCraft cutiePie = new HoverCraft("model1", "silver", 120, 50, 6, 10,500);
        cutiePie.startEngine();
        cutiePie.hover();
        System.out.println(cutiePie.getColor());

        //Car
        Car lightningMcQueen = new Car("model1", "black", 60, 15, 5, 25,4);
        lightningMcQueen.closeTrunk();

        //SemiTruck
        SemiTruck optimusPrime = new SemiTruck("model1", "blue/red", 190, 60, 3, 2000,3);
        optimusPrime.setNumberOfTrailers(3);
        optimusPrime.loadCargo();
    }
}