package com.xworkz.Institute;

import com.xworkz.Institute.institute.Institute;
import com.xworkz.Institute.trainee.Trainee;

import java.util.Scanner;

public class InstituteRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of trainees to be added:");
        int size = scanner.nextInt();

        Institute institute = new Institute(size);
        System.out.println("Institute capacity: " + size);

        for (int i = 0; i < size; i++) {
            Trainee trainee = new Trainee();

            System.out.println("Enter Trainee Id:");
            trainee.setTraineeId(scanner.nextInt());

            System.out.println("Enter Trainee Name:");
            trainee.setTraineeName(scanner.next());

            System.out.println("Enter Age:");
            trainee.setAge(scanner.nextInt());

            System.out.println("Enter Gender:");
            trainee.setGender(scanner.next());

            System.out.println("Enter Course:");
            trainee.setCourse(scanner.next());

            System.out.println("Enter Batch:");
            trainee.setBatch(scanner.next());

            System.out.println("Enter Email:");
            trainee.setEmail(scanner.next());

            System.out.println("Enter Phone Number:");
            trainee.setPhoneNumber(scanner.next());

            System.out.println("Enter Address:");
            scanner.nextLine(); // consume leftover newline
            trainee.setAddress(scanner.nextLine());

            System.out.println("Enter Qualification:");
            trainee.setQualification(scanner.next());

            System.out.println("Enter Specialization:");
            trainee.setSpecialization(scanner.next());

            System.out.println("Enter Join Date (yyyy-mm-dd):");
            trainee.setJoinDate(scanner.next());

            System.out.println("Enter Completion Date (yyyy-mm-dd):");
            trainee.setCompletionDate(scanner.next());

            System.out.println("Enter Fees Paid:");
            trainee.setFeesPaid(scanner.nextDouble());

            System.out.println("Is Placed (true/false):");
            trainee.setPlaced(scanner.nextBoolean());

            institute.addTrainee(trainee);
        }

        institute.getAllTrainees();
    }
}


/*
    public class InstituteRunner {
    public static void main(String[] args) {
        
            Trainee trainee = new Trainee();
            trainee.setTraineeId(1);
            trainee.setTraineeName("Trainee ");

            Institute institute = new Institute();
            institute.addTrainee(trainee);

            institute.getAllTrainees();
    }
}*/