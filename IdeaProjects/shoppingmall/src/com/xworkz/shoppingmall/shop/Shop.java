package com.xworkz.shoppingmall.shop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Shop {

    private int shopId;
    private String shopName;
    private String ownerName;
    private String category;
    private String location;
    private double rent;
    private int employeesCount;
    private String contactNumber;
    private boolean isOpen;
    private String openingTime;
    private String closingTime;
    private String floor;
    private String gstNumber;
}
