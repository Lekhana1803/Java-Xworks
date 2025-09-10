package com.xworks.googleapp.register;

import com.xworks.googleapp.google.GoogleUser;

public class GoogleRegistered {

    GoogleUser googleUser;

    public boolean createGoogleUser(GoogleUser googleUser) {
        boolean googleUserCreatedValid = false;
        boolean firstnameValid = false;
        boolean lastnameValid = false;
        boolean genderValid = false;
        boolean ageValid = false;
        boolean emailidValid = false;
        boolean confirmemailidValid = false;
        boolean dobValid = false;
        boolean phoneNumValid = false;
        boolean passwordValid = false;
        boolean confirmpasswordValid = false;

        if (googleUser.getFirstname() != null) {
            firstnameValid = true;
        } else {
            System.out.println("firstname is not valid");
        }

        if (googleUser.getLastname() != null) {
            lastnameValid = true;
        } else {
            System.out.println("lastname is invalid");
        }

        if (googleUser.getGender() != null) {
            genderValid = true;
        } else {
            System.out.println("lastname is invalid");
        }

        if (googleUser.getAge() != 0) {
            ageValid = true;
        } else {
            System.out.println("age is invalid");
        }

        if (googleUser.getEmailid() != null) {
            emailidValid = true;
        } else {
            System.out.println("email is invalid");
        }

        if (googleUser.getConfirmEmailid() != null) {
            confirmemailidValid = true;
        } else {
            System.out.println("email is invalid");
        }

        if (googleUser.getDob() != null) {
            dobValid = true;
        } else {
            System.out.println("dob is invalid");
        }

        if (googleUser.getPassword() != null) {
            passwordValid = true;
        } else {
            System.out.println("password is invalid");
        }

        if (googleUser.getConfirmpwd() != null) {
            confirmpasswordValid = true;
        } else {
            System.out.println("pwd is incorrect");
        }

        if (googleUser.getPhoneNum() != 0) {
            phoneNumValid = true;
        }else{
            System.out.println("incorrect phn num");
        }
        if(firstnameValid && lastnameValid && genderValid && ageValid && emailidValid &&confirmemailidValid && dobValid && phoneNumValid && passwordValid && confirmpasswordValid){
            System.out.println("user created sucessfully");
            googleUserCreatedValid = true;
            this.googleUser = googleUser;
        }
        else {
            System.out.println("user invalid");

        }

return googleUserCreatedValid;

    }
    public void getGoogleRegistered(){
        System.out.println("firstname"+googleUser.getFirstname());
        System.out.println("lastname"+googleUser.getLastname());
        System.out.println("gender"+googleUser.getGender());
        System.out.println("age"+googleUser.getAge());
        System.out.println("dob"+googleUser.getDob());
        System.out.println("email"+googleUser.getEmailid());
        System.out.println("confirm email"+googleUser.getConfirmEmailid());
        System.out.println("phone num"+googleUser.getPhoneNum());
        System.out.println("password"+googleUser.getPassword());
        System.out.println("confirm pass"+googleUser.getConfirmpwd());




    }

}
