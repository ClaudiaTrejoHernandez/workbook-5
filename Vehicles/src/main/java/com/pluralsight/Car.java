package com.pluralsight;

public class Car extends Vehicle{

    private int numberOfDoors;
    private boolean isElectric;
    private String bodyStyle;


    //Super constructor:

    public Car(String color, String vehicleMake, String vehicleModel, int odometer, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int numberOfDoors, boolean isElectric, String bodyStyle) {
        super(color, vehicleMake, vehicleModel, odometer, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.numberOfDoors = numberOfDoors;
        this.isElectric = isElectric;
        this.bodyStyle = bodyStyle;
    }


    //Getters and Setters:

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
    }
}
