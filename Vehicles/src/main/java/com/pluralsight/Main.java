package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Car carRide = new Car();
        carRide.setColor("Green");
        carRide.setFuelCapacity(8);

        Hovercraft hovercraft = new Hovercraft();
        hovercraft.setColor("Red");
        hovercraft.setFuelCapacity(7);

        Moped mopedRide = new Moped();
        mopedRide.setColor("Blue");
        mopedRide.setFuelCapacity(5);

        SemiTruck semiTruck = new SemiTruck();
        semiTruck.setColor("Black");
        semiTruck.setFuelCapacity(150);
    }
}