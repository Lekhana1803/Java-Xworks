package com.xworkz.amazon.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private int productId;
    private String name;
    private String category;
    private String brand;
    private double price;
    private int quantity;
    private String color;
    private String size;
    private double weight;
    private String material;
    private String description;
    private double rating;
    private int reviews;
    private String seller;
    private String warranty;
    private String manufactureDate;
    private String expiryDate;
    private boolean returnable;
    private String offer;
}
