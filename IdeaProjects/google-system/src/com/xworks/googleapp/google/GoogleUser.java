package com.xworks.googleapp.google;

public class GoogleUser {

    private String firstname;
    private String lastname;
    private String gender;
    private int age;
    private String emailid;
    private  String confirmEmailid;
    private String dob;
    private long phoneNum;
    private String password;
    private String confirmpwd;


    public String getFirstname(){
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname(){
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob(){
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmailid(){
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getConfirmEmailid(){
        return confirmEmailid;
    }

    public void setConfirmEmailid(String confirmEmailid) {
        this.confirmEmailid = confirmEmailid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmpwd() {
        return confirmpwd;
    }

    public void setConfirmpwd(String confirmpwd) {
        this.confirmpwd = confirmpwd;
    }
}
