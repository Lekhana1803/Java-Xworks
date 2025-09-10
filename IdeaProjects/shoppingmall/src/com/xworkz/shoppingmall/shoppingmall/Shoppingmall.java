package com.xworkz.shoppingmall.shoppingmall;

import com.xworkz.shoppingmall.shop.Shop;


public class Shoppingmall {
    private Shop[] shops;
    private int index;

    // Constructor to decide the size of mall
    public Shoppingmall(int size) {
        shops = new Shop[size];
    }

    public boolean addShop(Shop shop) {
        boolean isAdded = false;
        if (shop != null && index < shops.length) {
            shops[index++] = shop;
            isAdded = true;
        } else {
            System.out.println("Invalid Shop or limit reached");
        }
        return isAdded;
    }

    public void getAllShops() {
        System.out.println("List of Shops:");
        for (Shop shop : shops) {
            if (shop != null) {
                System.out.println("Shop Id: " + shop.getShopId());
                System.out.println("Shop Name: " + shop.getShopName());
                System.out.println("Owner: " + shop.getOwnerName());
                System.out.println("Category: " + shop.getCategory());
                System.out.println("Location: " + shop.getLocation());
                System.out.println("Rent: " + shop.getRent());
                System.out.println("Employees: " + shop.getEmployeesCount());
                System.out.println("Contact: " + shop.getContactNumber());
                System.out.println("Open: " + shop.isOpen());
                System.out.println("Timing: " + shop.getOpeningTime() + " - " + shop.getClosingTime());
                System.out.println("Floor: " + shop.getFloor());
                System.out.println("GST: " + shop.getGstNumber());
                System.out.println("-----------------------------------");
            }
        }
    }
}


/*

public class Shoppingmall {
    Shop[] shops = new Shop[13];
    int index;

    public boolean addShop(Shop shop) {
        boolean isAdded = false;
        if (shop != null && index < shops.length) {
            shops[index++] = shop;
            isAdded = true;
        } else {
            System.out.println("Invalid Shop or limit reached");
        }
        return isAdded;
    }

    public void getAllShops() {
        System.out.println("List of Shops:");
        for (Shop shop : shops) {
            if (shop != null) {
                System.out.println("Shop Id: " + shop.getShopId());
                System.out.println("Shop Name: " + shop.getShopName());
                System.out.println("Owner: " + shop.getOwnerName());
                System.out.println("Category: " + shop.getCategory());
                System.out.println("Location: " + shop.getLocation());
                System.out.println("Rent: " + shop.getRent());
                System.out.println("Employees: " + shop.getEmployeesCount());
                System.out.println("Contact: " + shop.getContactNumber());
                System.out.println("Open: " + shop.isOpen());
                System.out.println("Timing: " + shop.getOpeningTime() + " - " + shop.getClosingTime());
                System.out.println("Floor: " + shop.getFloor());
                System.out.println("GST: " + shop.getGstNumber());
                System.out.println("-----------------------------------");
            }
        }
    }
}*/



