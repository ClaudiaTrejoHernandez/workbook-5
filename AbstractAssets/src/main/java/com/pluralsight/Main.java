package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<Asset>();

        assets.add(new House("Regular Home","02-15-2015",75000,"100 Park Street, Eureka, CA 94100",3,1500,3));
        assets.add(new House("Vacation Home","05-01-2020",85500,"200 Vacation Lane, Honolulu, HI 96810",1,2000,5));

        assets.add(new Vehicle("Regular Car","01-02-2024",22000,"Hyundai Elantra",2023,17000));
        assets.add(new Vehicle("Vacation Car","01-23-2025",27000,"Toyota Camry",2025,5000));

        assets.add(new Vehicle("Fun Car","07-1-2020",75000,"Chevrolet Corvette", 1969,85000));

        Asset asset = new Asset("Test");

        for (Asset asset : assets) {
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Acquired On: " + asset.getDateAcquired());
            System.out.printf("Purchase Price: $%.2f%n", asset.getOriginalCost());
            System.out.printf("Current Value: $%.2f%n", asset.getValue());

            if (asset instanceof House) {
                House house = (House) asset;
                System.out.println("Address: " + house.getAddress());
            }
            if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset;
                System.out.println("Make & Model: " + vehicle.getMakeModel());
            }
            System.out.println("------------------------------------------------");

        }

    }
}