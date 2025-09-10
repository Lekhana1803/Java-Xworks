package com.xworks.googleapp;

import com.xworks.googleapp.google.GoogleUser;
import com.xworks.googleapp.register.GoogleRegistered;



public class GoogleRunner {

    public static void main(String[] args) {
        GoogleUser googleUser=new GoogleUser();
        googleUser.setFirstname("lekhana");
        googleUser.setLastname("im");
        googleUser.setGender("f");
        googleUser.setAge(23);
        googleUser.setDob("18-03-2002");
        googleUser.setEmailid("lekha18@gmail.com");
        googleUser.setConfirmEmailid("lekha18@gmail.com");
        googleUser.setPhoneNum(987778902);
        googleUser.setPassword("lekhan8");
        googleUser.setConfirmpwd("lekhan8");

       /* String firstName= googleUser.getFirstname();
        String lastName= googleUser.getLastname();
        String gender= googleUser.getGender();
        int age=googleUser.getAge();
        String dob=googleUser.getDob();
        String email=googleUser.getEmailid();
        String confirmEmail=googleUser.getConfirmEmailid();
        String password=googleUser.getPassword();
        String confirmpassword=googleUser.getConfirmpwd();
        long phoneNum=googleUser.getPhoneNum();

        System.out.println("name-"+firstName);
        System.out.println("lastname-"+lastName);
        System.out.println("gender-"+gender);
        System.out.println("age-"+age);
        System.out.println("dob-"+dob);
        System.out.println("email-"+email);
        System.out.println("confirm-"+confirmEmail);
        System.out.println("phone num-"+phoneNum);
        System.out.println("password-"+password);
        System.out.println("confirm-"+confirmpassword);
        System.out.println("main ended"); */


        GoogleRegistered googleRegistered=new GoogleRegistered();
        googleRegistered.createGoogleUser(googleUser);
        googleRegistered.getGoogleRegistered();

    }
}
