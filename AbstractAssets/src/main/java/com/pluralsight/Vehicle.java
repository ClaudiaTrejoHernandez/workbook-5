
package com.pluralsight;

import java.time.LocalDateTime;

public class Vehicle extends Asset{

    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    //Getters and Setters

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public double getValue() {
        int currentYear = LocalDateTime.now().getYear();
        int carAge = currentYear - year;
        double value = getOriginalCost();

        if (carAge <= 3){
            value -= value * (carAge * .03);
        } else if (carAge <= 6) {
            value -= value * (carAge * .06);
        } else if (carAge <= 10) {
            value -= value * (carAge * .08);
        } else {
            value = 1000.00;
        }

        if (odometer > 100000 && !(makeModel.toLowerCase().contains("honda") || makeModel.toLowerCase().contains("toyota"))) {
            value *= .75;
            return value;
        }
        return value;
    }
}
