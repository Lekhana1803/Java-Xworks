package com.xworkz.apollotechs.patient;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor//AllArgsConstructor used to write all the parameterized constructors
@NoArgsConstructor

public class Patient {

    private int patientId;
    private String patientName;
    private String address;
    private String gender;
    private int age;
    private String diseaseName;


    /*public int getPatientId(){
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }*/
}