package com.xworkz.bussinessapp.business;

import com.xworkz.bussinessapp.business.ratantata.Ratantata;

public class BusinessRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Business business =new Ratantata();
        business.doBusiness();
        System.out.println("main ended");
}
}
