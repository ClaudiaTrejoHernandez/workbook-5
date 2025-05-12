package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        //Instances of each vehicle types:

        Car elantra = new Car();
        elantra.setVehicleMake("Hyundai");
        elantra.setVehicleModel("Elantra");
        elantra.setColor("Red");
        elantra.setFuelCapacity(9);
        elantra.setBodyStyle("Sedan");
        elantra.setElectric(false);
        elantra.setNumberOfDoors(4);

        Hovercraft hovercraft = new Hovercraft();
        hovercraft.setVehicleMake("Hoverstream Humpback 24KT");
        hovercraft.setVehicleModel("Wagner RACE 4");
        hovercraft.setColor("Red");
        hovercraft.setFuelCapacity(7);
        hovercraft.setMaxAltitude(10000);
        hovercraft.setNumberOfBlades(4);
        hovercraft.setCanOperateOnWater(true);

        Moped mopedRide = new Moped();
        mopedRide.setVehicleMake("HHH");
        mopedRide.setVehicleModel("VINO 50");
        mopedRide.setColor("Blue");
        mopedRide.setFuelCapacity(5);
        mopedRide.setStorage(true);
        mopedRide.setPassengerSeat(true);
        mopedRide.setHasPedals(false);
        mopedRide.setEngineCC(49);
        mopedRide.setStreetLegal(true);


        SemiTruck semiTruck = new SemiTruck();
        semiTruck.setMaxLoadBearing(80000);
        semiTruck.setHasSleeperCabin(true);
        semiTruck.setNumberOfTrailers(1);
        semiTruck.setNumberOfAxles(5);
        semiTruck.setColor("Black");
        semiTruck.setFuelCapacity(150);
    }
}