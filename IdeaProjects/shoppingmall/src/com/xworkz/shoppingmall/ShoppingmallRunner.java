package com.xworkz.shoppingmall;

import com.xworkz.shoppingmall.shop.Shop;
import com.xworkz.shoppingmall.shoppingmall.Shoppingmall;

import java.util.Scanner;


public class ShoppingmallRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of shops to be added:");
        int size = scanner.nextInt();

        Shoppingmall mall = new Shoppingmall(size); // dynamic capacity
        System.out.println("Shops available capacity: " + size);

        for (int i = 0; i < size; i++) {
            Shop shop = new Shop();

            System.out.println("Enter Shop Id:");
            shop.setShopId(scanner.nextInt());

            System.out.println("Enter Shop Name:");
            shop.setShopName(scanner.next());

            System.out.println("Enter Owner Name:");
            shop.setOwnerName(scanner.next());

            System.out.println("Enter Category:");
            shop.setCategory(scanner.next());

            System.out.println("Enter Location:");
            shop.setLocation(scanner.next());

            System.out.println("Enter Rent:");
            shop.setRent(scanner.nextDouble());

            System.out.println("Enter Employees Count:");
            shop.setEmployeesCount(scanner.nextInt());

            System.out.println("Enter Contact Number:");
            shop.setContactNumber(scanner.next());

            System.out.println("Is Open (true/false):");
            shop.setOpen(scanner.nextBoolean());

            System.out.println("Enter Opening Time:");
            shop.setOpeningTime(scanner.next());

            System.out.println("Enter Closing Time:");
            shop.setClosingTime(scanner.next());

            System.out.println("Enter Floor:");
            shop.setFloor(scanner.next());

            System.out.println("Enter GST Number:");
            shop.setGstNumber(scanner.next());

            mall.addShop(shop);
        }

        mall.getAllShops();
    }
}
/*
public class ShoppingmallRunner {

    public static void main(String[] args) {
        Shoppingmall mall = new Shoppingmall();

        Shop shop1 = new Shop();
        shop1.setShopId(1);
        shop1.setShopName("Reliance Trends");
        shop1.setOwnerName("Arjun");
        shop1.setCategory("Clothing");
        shop1.setLocation("Ground Floor");
        shop1.setRent(50000);
        shop1.setEmployeesCount(15);
        shop1.setContactNumber("9876543210");
        shop1.setOpen(true);
        shop1.setOpeningTime("10:00 AM");
        shop1.setClosingTime("9:00 PM");
        shop1.setFloor("G");
        shop1.setGstNumber("GST12345");
        mall.addShop(shop1);

        Shop shop2 = new Shop();
        shop2.setShopId(2);
        shop2.setShopName("Croma");
        shop2.setOwnerName("Meena");
        shop2.setCategory("Electronics");
        shop2.setLocation("First Floor");
        shop2.setRent(80000);
        shop2.setEmployeesCount(20);
        shop2.setContactNumber("9876543211");
        shop2.setOpen(true);
        shop2.setOpeningTime("10:30 AM");
        shop2.setClosingTime("9:30 PM");
        shop2.setFloor("1F");
        shop2.setGstNumber("GST12346");
        mall.addShop(shop2);

        // ... add up to 13 shops in the same way

        mall.getAllShops();
    }
}*/
