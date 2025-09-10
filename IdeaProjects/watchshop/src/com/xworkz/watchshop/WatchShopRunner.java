package com.xworkz.watchshop;

import com.xworkz.watchshop.watch.Watch;
import com.xworkz.watchshop.watchshop.WatchShop;

import java.util.Scanner;

public class WatchShopRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of watches to be added:");
        int size = scanner.nextInt();

        WatchShop shop = new WatchShop(size);
        System.out.println("Watch shop capacity: " + size);

        for (int i = 0; i < size; i++) {
            Watch watch = new Watch();

            System.out.println("Enter Watch Id:");
            watch.setWatchId(scanner.nextInt());

            System.out.println("Enter Brand:");
            watch.setBrand(scanner.next());

            System.out.println("Enter Model:");
            watch.setModel(scanner.next());

            System.out.println("Enter Price:");
            watch.setPrice(scanner.nextDouble());

            System.out.println("Enter Type (Analog/Digital):");
            watch.setType(scanner.next());

            System.out.println("Enter Material:");
            watch.setMaterial(scanner.next());

            System.out.println("Enter Color:");
            watch.setColor(scanner.next());

            System.out.println("Is Water Resistant (true/false):");
            watch.setWaterResistant(scanner.nextBoolean());

            System.out.println("Enter Warranty:");
            watch.setWarranty(scanner.next());

            shop.addWatch(watch);
        }

        shop.getAllWatches();
    }
}


/*
public class WatchShopRunner {

    public static void main(String[] args) {

        WatchShop shop = new WatchShop();

        // Example Watch 1
        Watch watch1 = new Watch();
        watch1.setWatchId(1);
        watch1.setBrand("Rolex");
        watch1.setModel("Submariner");
        watch1.setPrice(750000.0);
        watch1.setType("Analog");
        watch1.setMaterial("Steel");
        watch1.setColor("Silver");
        watch1.setWaterResistant(true);
        watch1.setWarranty("5 Years");
        shop.addWatch(watch1);

        // Example Watch 2
        Watch watch2 = new Watch();
        watch2.setWatchId(2);
        watch2.setBrand("Casio");
        watch2.setModel("G-Shock");
        watch2.setPrice(12000.0);
        watch2.setType("Digital");
        watch2.setMaterial("Resin");
        watch2.setColor("Black");
        watch2.setWaterResistant(true);
        watch2.setWarranty("2 Years");
        shop.addWatch(watch2);

        // Add up to 9 watches like this...

        shop.getAllWatches();
    }
}*/

