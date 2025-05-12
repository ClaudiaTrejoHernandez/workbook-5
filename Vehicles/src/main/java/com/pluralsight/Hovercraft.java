package com.pluralsight;

public class Hovercraft extends Vehicle{

    private int numberOfFans;
    private int maxAltitude;
    private boolean canOperateOnWater;


    //Getters and Setters:

    public int getNumberOfFans() {
        return numberOfFans;
    }

    public void setNumberOfBlades(int numberOfFans) {
        this.numberOfFans = numberOfFans;
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
