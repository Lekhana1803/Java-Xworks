package com.xworkz.watchshop.watchshop;

import com.xworkz.watchshop.watch.Watch;

public class WatchShop {
    public Watch[] watches;   // made public
    int index;         // made public

    // Constructor for dynamic size
    public WatchShop(int size) {
        watches = new Watch[size];
    }

    public boolean addWatch(Watch watch) {
        boolean isAdded = false;
        if (watch != null && index < watches.length) {
            watches[index++] = watch;
            isAdded = true;
        } else {
            System.out.println("Invalid Watch or limit reached");
        }
        return isAdded;
    }

    public void getAllWatches() {
        System.out.println("List of Watches:");
        for (Watch watch : watches) {
            if (watch != null) {
                System.out.println("Watch Id: " + watch.getWatchId());
                System.out.println("Brand: " + watch.getBrand());
                System.out.println("Model: " + watch.getModel());
                System.out.println("Price: " + watch.getPrice());
                System.out.println("Type: " + watch.getType());
                System.out.println("Material: " + watch.getMaterial());
                System.out.println("Color: " + watch.getColor());
                System.out.println("Water Resistant: " + watch.isWaterResistant());
                System.out.println("Warranty: " + watch.getWarranty());
                System.out.println("-----------------------------------");
            }
        }
    }
}


/*
public class WatchShop {

    Watch[] watches = new Watch[9];
    int index;

    public boolean addWatch(Watch watch) {
        boolean isAdded = false;
        if (watch != null && index < watches.length) {
            watches[index++] = watch;
            isAdded = true;
        } else {
            System.out.println("Invalid Watch or limit reached");
        }
        return isAdded;
    }

    public void getAllWatches() {
        System.out.println("List of Watches:");
        for (Watch watch : watches) {
            if (watch != null) {
                System.out.println("Watch Id: " + watch.getWatchId());
                System.out.println("Brand: " + watch.getBrand());
                System.out.println("Model: " + watch.getModel());
                System.out.println("Price: " + watch.getPrice());
                System.out.println("Type: " + watch.getType());
                System.out.println("Material: " + watch.getMaterial());
                System.out.println("Color: " + watch.getColor());
                System.out.println("Water Resistant: " + watch.isWaterResistant());
                System.out.println("Warranty: " + watch.getWarranty());
                System.out.println("-----------------------------------");
            }
        }
    }
}*/

