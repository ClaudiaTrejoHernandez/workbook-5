package com.pluralsight;

public class SemiTruck extends Vehicle{

        private int maxLoadBearing;
        private boolean hasSleeperCabin;
        private int numberOfTrailers;
        private int numberOfAxles;


        //Getters and Setters:

        public int getMaxLoadBearing() {
                return maxLoadBearing;
        }

        public void setMaxLoadBearing(int maxLoadBearing) {
                this.maxLoadBearing = maxLoadBearing;
        }

        public boolean isHasSleeperCabin() {
                return hasSleeperCabin;
        }

        public void setHasSleeperCabin(boolean hasSleeperCabin) {
                this.hasSleeperCabin = hasSleeperCabin;
        }

        public int getNumberOfTrailers() {
                return numberOfTrailers;
        }

        public void setNumberOfTrailers(int numberOfTrailers) {
                this.numberOfTrailers = numberOfTrailers;
        }

        public int getNumberOfAxles() {
                return numberOfAxles;
        }

        public void setNumberOfAxles(int numberOfAxles) {
                this.numberOfAxles = numberOfAxles;
        }
}
