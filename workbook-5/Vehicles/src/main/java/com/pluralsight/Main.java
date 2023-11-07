package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        //Moped
        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);

        System.out.println(slowRide.getColor());
        System.out.println(slowRide.getFuelCapacity());

        //HoverCraft
        HoverCraft cutiePie = new HoverCraft();
        cutiePie.setColor("Green");
        cutiePie.startEngine();
        cutiePie.hover();
        System.out.println(cutiePie.getColor());

        //Car
        Car lightningMcQueen = new Car();
        lightningMcQueen.setNumberOfDoors(2);
        lightningMcQueen.setTopSpeed(500);
        lightningMcQueen.closeTrunk();

        //SemiTruck
        SemiTruck optimusPrime = new SemiTruck();
        optimusPrime.setNumberOfTrailers(3);
        optimusPrime.loadCargo();
    }
}