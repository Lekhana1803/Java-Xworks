package com.xworkz.amazonapp.amazon;
import com.xworkz.amazonapp.amazon.product.Product;
import com.xworkz.amazonapp.amazon.amazon.Amazon;


public class ProductRunner {
    public static void main(String[] args) {

        Amazon amazon = new Amazon();
        amazon.setUserName("sahana");
        amazon.setFirstName("A");
        amazon.setEmail("sahana@123");
        amazon.setGender("female");
        amazon.setPwd("sahana1234");
        amazon.setPhoneNumber("9985742136");

        Product product = new Product();
        boolean amazonAdded = product.addAmazon(amazon);
        if (amazonAdded) {
            product.getAmazonInfo();
        } else {
        }
        System.out.println("Amazon is not added");
    }
}