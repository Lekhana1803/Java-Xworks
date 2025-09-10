package com.xworkz.amazonapp.amazon.validate;
import com.xworkz.amazonapp.amazon.amazon.Amazon;
public class AmazonValidator {



    Amazon amazon;
    public boolean validAmazonInfo(Amazon amazon){
        boolean amazonValidated = false;
        boolean firstNameValid = false;
        boolean userNameValid = false;
        boolean phoneNumberValid = false;
        boolean genderValid = false;
        boolean emailValid = false;
        boolean pwdValid = false;


        if (amazon.getFirstName()!=null && ! amazon.getFirstName().isEmpty()){
            firstNameValid=true;
        }
        else {
            System.out.println("firstname is valid");
        }
        if(amazon.getUserName()!=null && ! amazon.getUserName().isEmpty()){
            userNameValid=true;
        }else {
            System.out.println("username is valid");
        }
        if (amazon.getPhoneNumber()!=null && !amazon.getPhoneNumber().isEmpty()){
            phoneNumberValid=true;
        }else {
            System.out.println("phonenumber is valid");
        }
        if (amazon.getGender()!=null && !amazon.getGender().isEmpty()){
            genderValid=true;
        }else {
            System.out.println("gender is valid");
        }
        if (amazon.getEmail()!=null && !amazon.getEmail().isEmpty()){
            emailValid=true;
        }else {
            System.out.println("email  is valid");
        }

        if(amazon.getPwd()!=null && !amazon.getPwd().isEmpty()){
            pwdValid=true;
        }else{
            System.out.println("pwd is valid");
        }
        if (firstNameValid && userNameValid && pwdValid &&emailValid && phoneNumberValid && genderValid){
            this.amazon=amazon;
            amazonValidated=true;
        }
        return amazonValidated;
    }
}