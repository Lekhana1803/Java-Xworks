package com.xworkz.amazon.amazon;

import com.xworkz.amazon.product.Product;


public class Amazon {

    public Product[] products;
    private int index;

    public Amazon(int size) {
        products = new Product[size];
    }

    public boolean addProduct(Product product) {
        if (product != null && index < products.length) {
            products[index++] = product;
            return true;
        }
        System.out.println("Invalid Product or limit reached");
        return false;
    }

    public void getAllProducts() {
        System.out.println("---- List of Products ----");
        for (Product product : products) {
            if (product != null) {
                System.out.println("Product ID: " + product.getProductId());
                System.out.println("Name: " + product.getName());
                System.out.println("Category: " + product.getCategory());
                System.out.println("Brand: " + product.getBrand());
                System.out.println("Price: " + product.getPrice());
                System.out.println("Quantity: " + product.getQuantity());
                System.out.println("Color: " + product.getColor());
                System.out.println("Size: " + product.getSize());
                System.out.println("Weight: " + product.getWeight());
                System.out.println("Material: " + product.getMaterial());
                System.out.println("Description: " + product.getDescription());
                System.out.println("Rating: " + product.getRating());
                System.out.println("Reviews: " + product.getReviews());
                System.out.println("Seller: " + product.getSeller());
                System.out.println("Warranty: " + product.getWarranty());
                System.out.println("Manufacture Date: " + product.getManufactureDate());
                System.out.println("Expiry Date: " + product.getExpiryDate());
                System.out.println("Returnable: " + product.isReturnable());
                System.out.println("Offer: " + product.getOffer());
                System.out.println("------------------------------------");
            }
        }
    }
}