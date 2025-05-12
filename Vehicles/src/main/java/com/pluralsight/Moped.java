package com.pluralsight;

public class Moped extends Vehicle{

        private boolean storage;
        private boolean passengerSeat;
        private boolean hasPedals;
        private int engineCC;
        private boolean isStreetLegal;

        //Getters and Setters:

        public boolean isStorage() {
                return storage;
        }

        public void setStorage(boolean storage) {
                this.storage = storage;
        }

        public boolean isPassengerSeat() {
                return passengerSeat;
        }

        public void setPassengerSeat(boolean passengerSeat) {
                this.passengerSeat = passengerSeat;
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
