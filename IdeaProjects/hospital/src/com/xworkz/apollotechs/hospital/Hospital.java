package com.xworkz.apollotechs.hospital;

import com.xworkz.apollotechs.patient.Patient;


public class Hospital {

    public Hospital(int size){
        patients=new Patient[size];
    }

    public Patient[] patients;
    int index;

    public boolean addPatient(Patient patient){
        boolean isPatientAdded = false;
        if (patient != null){

            patients[index++] = patient;
            isPatientAdded = true;
        }
        else{
            System.out.println("Invalid Patient");
        }
        return isPatientAdded;
    }

    public void getAllPatients(){
        System.out.println("The List of Patients are: "+ patients.length);
        for(Patient patient : patients){
            System.out.println("The patient id is : "+patient.getPatientId());
           System.out.println("The Patient Name is: " +patient.getPatientName());
            System.out.println("The patient age is : "+patient.getAge());
            System.out.println("The patient gender is : "+patient.getGender());
            System.out.println("The patient adress is : "+patient.getAddress());
            System.out.println("The patient diseasename is : "+patient.getDiseaseName());

            System.out.println("------------------------------");
   }
}

    public boolean updateAgeById(int updateAge, int existingId) {
        System.out.println("invoked updatedPatientAgeId");
        boolean ageupdated = false;

        for (Patient patient : this.patients) {
            if (patient.getPatientId() == existingId) {
                patient.setAge(updateAge);
                System.out.println("Age is Updated");
                ageupdated = true;
            }
        }
        if (ageupdated == false)  System.out.println("Patient Id " + existingId + "does not exist");

        return ageupdated;
    }

    public String getPatientNameById(int id){
        String patientName = null ;
        for (Patient patient : this.patients){
            if (patient.getPatientId() == id){
                patientName = patient.getPatientName();
            }
        }
        if (patientName == null) System.out.println("Patient name is not found with patient Id "+patientName);
        return patientName;
    }


}