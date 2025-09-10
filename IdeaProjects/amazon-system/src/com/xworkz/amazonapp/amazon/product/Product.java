package com.xworkz.amazonapp.amazon.product;
import com.xworkz.amazonapp.amazon.amazon.Amazon;
import com.xworkz.amazonapp.amazon.validate.AmazonValidator;

public class Product {

    Amazon amazon;

    public boolean addAmazon(Amazon amazon){
        boolean isAmazonAdded=false;

        AmazonValidator amazonValidator = new AmazonValidator();
        boolean isAmazonInfoAddedValid=amazonValidator.validAmazonInfo(amazon);

        if (isAmazonInfoAddedValid) {
            this.amazon = amazon;
            isAmazonAdded = true;
        }
        return isAmazonAdded;
    }


    public void getAmazonInfo(){
        System.out.println("The amazon info:"+amazon.getFirstName());
        System.out.println("the amazon is:"+amazon.getUserName());
        System.out.println("The amazon is :"+amazon.getPhoneNumber());
        System.out.println("The amazon is :"+amazon.getEmail());
        System.out.println("The amazon is :"+amazon.getPwd());

    }

}