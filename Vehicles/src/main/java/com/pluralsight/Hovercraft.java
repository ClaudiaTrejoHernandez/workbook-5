package com.pluralsight;

public class Hovercraft extends Vehicle{

    private int numberOfBlades;
    private int maxAltitude;
    private boolean canOperateOnWater;


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
