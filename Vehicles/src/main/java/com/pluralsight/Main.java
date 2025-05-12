package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        //Instances of each vehicle types:

        Car myCar = new Car("Red","Hyundai","Elantra",17000,5,20000,9,4,true,"Sedan");
        System.out.println("\n------ Car Details ------");
        System.out.println("Color: " + myCar.getColor());
        System.out.println("Make: " + myCar.getVehicleMake());
        System.out.println("Model: " + myCar.getVehicleModel());
        System.out.println("Odometer: " + myCar.getOdometer() + " Miles");
        System.out.println("Passengers: " + myCar.getNumberOfPassengers());
        System.out.println("Cargo Capacity: " + myCar.getCargoCapacity());
        System.out.println("Fuel Capacity: " + myCar.getFuelCapacity());
        System.out.println("Doors: " + myCar.getNumberOfDoors());
        System.out.println("Electric: " + (myCar.isElectric() ? "Yes" : "No"));
        System.out.println("Body Style: " + myCar.getBodyStyle());


        Hovercraft hovercraft = new Hovercraft("Black","Hoverstream Humpback 24KT","Wagner RACE 4",200,4,8000,7,4,10000,true);
        System.out.println("\n------ Hovercraft Details ------");
        System.out.println("Color: " + hovercraft.getColor());
        System.out.println("Make: " + hovercraft.getVehicleMake());
        System.out.println("Model: " + hovercraft.getVehicleModel());
        System.out.println("Odometer: " + hovercraft.getOdometer() + " Miles");
        System.out.println("Passengers: " + hovercraft.getNumberOfPassengers());
        System.out.println("Cargo Capacity: " + hovercraft.getCargoCapacity());
        System.out.println("Fuel Capacity: " + hovercraft.getFuelCapacity());
        System.out.println("Number of Blades: " + hovercraft.getNumberOfBlades());
        System.out.println("Max Altitude: " + hovercraft.getMaxAltitude());
        System.out.println("Can operate on water: " + (hovercraft.isCanOperateOnWater() ? "Yes" : "No"));


        Moped mopedRide = new Moped("Blue","HHH","VINO 50",2500,2,500,5,true,false,49,true);
        System.out.println("\n------ Moped Details ------");
        System.out.println("Color: " + mopedRide.getColor());
        System.out.println("Make: " + mopedRide.getVehicleMake());
        System.out.println("Model: " + mopedRide.getVehicleModel());
        System.out.println("Odometer: " + mopedRide.getOdometer() + " Miles");
        System.out.println("Passengers: " + mopedRide.getNumberOfPassengers());
        System.out.println("Cargo Capacity: " + mopedRide.getCargoCapacity());
        System.out.println("Fuel Capacity: " + mopedRide.getFuelCapacity());
        System.out.println("Has Storage: " + (mopedRide.isStorage() ? "Yes" : "No"));
        System.out.println("Has Pedals: " + (mopedRide.isHasPedals() ? "Yes" : "No"));
        System.out.println("Engine CC: " + mopedRide.getEngineCC());
        System.out.println("Is street legal: " + mopedRide.isStreetLegal());


        SemiTruck semiTruck = new SemiTruck("Green","Peterbilt","365",50500,2,50000,150,80000,true,1,5);
        System.out.println("\n------ SemiTruck Details ------");
        System.out.println("Color: " + semiTruck.getColor());
        System.out.println("Make: " + semiTruck.getVehicleMake());
        System.out.println("Model: " + semiTruck.getVehicleModel());
        System.out.println("Odometer: " + semiTruck.getOdometer() + " Miles");
        System.out.println("Passengers: " + semiTruck.getNumberOfPassengers());
        System.out.println("Cargo Capacity: " + semiTruck.getCargoCapacity());
        System.out.println("Fuel Capacity: " + semiTruck.getFuelCapacity());
        System.out.println("Max Load Bearing: " + semiTruck.getMaxLoadBearing());
        System.out.println("Has sleeper Cabin:" + (semiTruck.isHasSleeperCabin() ? "Yes" : "No"));
        System.out.println("Number of Trailers: " + semiTruck.getNumberOfTrailers());
        System.out.println("Number of Axels: " + semiTruck.getNumberOfTrailers());
    }
}