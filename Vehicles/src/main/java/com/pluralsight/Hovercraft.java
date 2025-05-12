package com.pluralsight;

public class Hovercraft extends Vehicle{

    private int numberOfBlades;
    private int maxAltitude;
    private boolean canOperateOnWater;


    //Super Constructor

    public Hovercraft(String color, String vehicleMake, String vehicleModel, int odometer, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int numberOfBlades, int maxAltitude, boolean canOperateOnWater) {
        super(color, vehicleMake, vehicleModel, odometer, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.numberOfBlades = numberOfBlades;
        this.maxAltitude = maxAltitude;
        this.canOperateOnWater = canOperateOnWater;
    }


    //Getters and Setters:

    public int getNumberOfBlades() {
        return numberOfBlades;
    }

    public void setNumberOfBlades(int numberOfFans) {
        this.numberOfBlades = numberOfFans;
    }

    public int getMaxAltitude() {
        return maxAltitude;
    }

    public void setMaxAltitude(int maxAltitude) {
        this.maxAltitude = maxAltitude;
    }

    public boolean isCanOperateOnWater() {
        return canOperateOnWater;
    }

    public void setCanOperateOnWater(boolean canOperateOnWater) {
        this.canOperateOnWater = canOperateOnWater;
    }
}
