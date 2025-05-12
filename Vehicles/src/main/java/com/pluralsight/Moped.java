package com.pluralsight;

public class Moped extends Vehicle{

        private boolean storage;
        private boolean hasPedals;
        private int engineCC;
        private boolean isStreetLegal;


        //Super Constructor:

        public Moped(String color, String vehicleMake, String vehicleModel, int odometer, int numberOfPassengers, int cargoCapacity, int fuelCapacity, boolean storage, boolean hasPedals, int engineCC, boolean isStreetLegal) {
                super(color, vehicleMake, vehicleModel, odometer, numberOfPassengers, cargoCapacity, fuelCapacity);
                this.storage = storage;
                this.hasPedals = hasPedals;
                this.engineCC = engineCC;
                this.isStreetLegal = isStreetLegal;
        }


        //Getters and Setters:

        public boolean isStorage() {
                return storage;
        }

        public void setStorage(boolean storage) {
                this.storage = storage;
        }

        public boolean isHasPedals() {
                return hasPedals;
        }

        public void setHasPedals(boolean hasPedals) {
                this.hasPedals = hasPedals;
        }

        public int getEngineCC() {
                return engineCC;
        }

        public void setEngineCC(int engineCC) {
                this.engineCC = engineCC;
        }

        public boolean isStreetLegal() {
                return isStreetLegal;
        }

        public void setStreetLegal(boolean streetLegal) {
                isStreetLegal = streetLegal;
        }
}
