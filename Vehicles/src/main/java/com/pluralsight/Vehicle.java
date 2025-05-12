package com.pluralsight;

public class Vehicle {

    private String color;
    private String vehicleMake;
    private String vehicleModel;
    private int odometer;
    private int numberOfPassengers;
    private int cargoCapacity;
    private int fuelCapacity;

    //Section 2-2: Working with Constructors

    public Vehicle(String color, String vehicleMake, String vehicleModel, int odometer, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        this.color = color;
        this.vehicleMake = vehicleMake;
        this.vehicleModel = vehicleModel;
        this.odometer = odometer;
        this.numberOfPassengers = numberOfPassengers;
        this.cargoCapacity = cargoCapacity;
        this.fuelCapacity = fuelCapacity;
    }


    //Getters and Setters:

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
}
