package com.xworkz.Institute.institute;

import com.xworkz.Institute.trainee.Trainee;

public class Institute {
    public Trainee[] trainees;
    public int index;

    public Institute(int size) {
        this.trainees = new Trainee[size]; // array size will be given dynamically
        this.index = 0;
    }

    public boolean addTrainee(Trainee trainee) {
        boolean isAdded = false;
        if (trainee != null && index < trainees.length) {
            trainees[index++] = trainee;
            isAdded = true;
        } else {
            System.out.println("Invalid Trainee or limit reached");
        }
        return isAdded;
    }

    public void getAllTrainees() {
        System.out.println("List of Trainees:");
        for (Trainee trainee : trainees) {
            if (trainee != null) {
                System.out.println("Trainee Id: " + trainee.getTraineeId());
                System.out.println("Trainee Name: " + trainee.getTraineeName());
                System.out.println("Age: " + trainee.getAge());
                System.out.println("Gender: " + trainee.getGender());
                System.out.println("Course: " + trainee.getCourse());
                System.out.println("Batch: " + trainee.getBatch());
                System.out.println("Email: " + trainee.getEmail());
                System.out.println("Phone: " + trainee.getPhoneNumber());
                System.out.println("Address: " + trainee.getAddress());
                System.out.println("Qualification: " + trainee.getQualification());
                System.out.println("Specialization: " + trainee.getSpecialization());
                System.out.println("Join Date: " + trainee.getJoinDate());
                System.out.println("Completion Date: " + trainee.getCompletionDate());
                System.out.println("Fees Paid: " + trainee.getFeesPaid());
                System.out.println("Placed: " + trainee.isPlaced());
                System.out.println("-----------------------------------");
            }
        }
    }
}


/*
public class Institute {
    Trainee[] trainees = new Trainee[15];
    int index;

    public boolean addTrainee(Trainee trainee) {
        boolean isAdded = false;
        if (trainee != null && index < trainees.length) {
            trainees[index++] = trainee;
            isAdded = true;
        } else {
            System.out.println("Invalid Trainee or limit reached");
        }
        return isAdded;
    }

    public void getAllTrainees() {
        System.out.println("List of Trainees:");
        for (Trainee trainee : trainees) {

                System.out.println("Trainee Id: " + trainee.getTraineeId());
                System.out.println("Trainee Name: " + trainee.getTraineeName());
                System.out.println("-----------------------------");
            }
        }
    }*/
