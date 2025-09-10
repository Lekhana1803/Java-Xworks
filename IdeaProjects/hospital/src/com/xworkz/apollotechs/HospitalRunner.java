package com.xworkz.apollotechs;

import com.xworkz.apollotechs.hospital.Hospital;
import com.xworkz.apollotechs.patient.Patient;

import javax.xml.soap.SOAPPart;
import java.util.Scanner;

public class HospitalRunner {

    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number of patients to be added");
        int size=scanner.nextInt();
        Hospital hospital=new Hospital(size);
        System.out.println("patients available are:"+hospital.patients.length);
        for(int i=0;i<size;i++){
            Patient patient=new Patient();
            System.out.println("enter patient id:");
            //int patientId= scanner.nextInt();
            //patient.setPatientId(patientId);
            patient.setPatientId(scanner.nextInt());


            System.out.println("enter the patient name");
            //String patientName= scanner.next();
            //patient.setPatientName(patientName);
            patient.setPatientName(scanner.next());

            System.out.println("enter the patient age");
            //int age= scanner.nextInt();
            //patient.setAge(age);
            patient.setAge(scanner.nextInt());

            System.out.println("enter the patient adress");
            patient.setAddress(scanner.next());

            System.out.println("enter the patient gender");
            patient.setGender(scanner.next());

            System.out.println("enter the patient diseasename");
            patient.setDiseaseName(scanner.next());

            hospital.addPatient(patient);
        }

        hospital.getAllPatients();

    }
}

        /*Patient patient = new Patient();
        patient.setPatientId(1);
        patient.setPatientName("Abc");
        patient.setAge(45);

        Patient patient1 = new Patient();
        patient1.setPatientId(2);
        patient1.setPatientName("XYX");
        patient.setAge(4);


        Patient patient2 = new Patient();
        patient2.setPatientId(3);
        patient1.setPatientName("jjj");
        patient.setAge(15);


        Hospital hospital = new Hospital();
        hospital.addPatient(patient);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        hospital.getAllPatients();


System.out.println("patient id"+patient.getPatientId());*/

