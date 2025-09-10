package com.xworkz.police.policestation;

import com.xworkz.police.police.Police;

public class PoliceStation {

    public Police[] polices; // Public array like Hospital
    public int index;        // Public index to track added officers

    // Constructor to initialize Police array
    public PoliceStation(int size) {
        polices = new Police[size];
        index = 0;
    }

    // Method to add a Police officer
    public boolean addPolice(Police police) {
        boolean isPoliceAdded = false;
        if (police != null && index < polices.length) {
            polices[index++] = police;
            isPoliceAdded = true;
        } else {
            System.out.println("Invalid Police or limit reached");
        }
        return isPoliceAdded;
    }

    // Method to display all Police officers
    public void getAllPolices() {
        System.out.println("The list of Police officers: " + polices.length);
        for (Police police : polices) {
            if (police != null) {
                System.out.println("Police ID: " + police.getPoliceId());
                System.out.println("Name: " + police.getName());
                System.out.println("Rank: " + police.getRank());
                System.out.println("Age: " + police.getAge());
                System.out.println("Gender: " + police.getGender());
                System.out.println("On Duty: " + police.isOnDuty());
                System.out.println("------------------------------");
            }
        }
    }
}

/*
public class PoliceStation {
    Police[] polices = new Police[6];
    int index;

    public boolean addPolice(Police police) {
        boolean isAdded = false;
        if (police != null && index < polices.length) {
            polices[index++] = police;
            isAdded = true;
        } else {
            System.out.println("Invalid Police or limit reached");
        }
        return isAdded;
    }

    public void getAllPolices() {
        System.out.println("List of Polices:");
        for (Police police : polices) {
            if (police != null) {
                System.out.println("Police Id: " + police.getPoliceId());
                System.out.println("Police Name: " + police.getName());
                System.out.println("-----------------------------");
            }
        }
    }
}*/