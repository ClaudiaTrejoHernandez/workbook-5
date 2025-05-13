package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assetList = new ArrayList<Asset>();

        assetList.add(new House("Regular Home","02-15-2015",75000,"100 Park Street, Eureka, CA 94100",3,1500,3));
        assetList.add(new House("Vacation Home","05-01-2020",85500,"200 Vacation Lane, Honolulu, HI 96810",1,2000,5));

        assetList.add(new Vehicle("Regular Car","03-03-2023",22000,"Hyundai Elantra",2023,17000));
        assetList.add(new Vehicle("Vacation Car","01-23-2025",27000,"Toyota Camry",2025,5000));

        for (Asset asset : assetList) {
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Acquired On: " + asset.getDateAcquired());
            System.out.printf("Purchase Price: $%.2f%n", asset.getOriginalCost());
            System.out.printf("Current Value: $%.2f%n", asset.getValue());
            System.out.println("-----------------------------------");
        }


    }
}