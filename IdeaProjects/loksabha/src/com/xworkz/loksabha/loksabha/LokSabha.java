package com.xworkz.loksabha.loksabha;

import com.xworkz.loksabha.politician.Politician;


public class LokSabha {
    public Politician[] politicians;
    private int index;

    public LokSabha(int size) {
        politicians = new Politician[size];
    }

    public boolean addPolitician(Politician politician) {
        if (politician != null && index < politicians.length) {
            politicians[index++] = politician;
            return true;
        }
        System.out.println("Invalid Politician or limit reached");
        return false;
    }

    public void getAllPoliticians() {
        System.out.println("=== List of Politicians ===");
        for (Politician politician : politicians) {
            if (politician != null) {
                System.out.println("Id: " + politician.getPoliticianId());
                System.out.println("Name: " + politician.getName());
                System.out.println("Party: " + politician.getParty());
                System.out.println("Constituency: " + politician.getConstituency());
                System.out.println("Age: " + politician.getAge());
                System.out.println("State: " + politician.getState());
                System.out.println("Position: " + politician.getPosition());
                System.out.println("Experience: " + politician.getExperienceYears());
                System.out.println("Education: " + politician.getEducation());
                System.out.println("Contact: " + politician.getContact());
                System.out.println("Minister: " + politician.isMinister());
                System.out.println("Term: " + politician.getTerm());
                System.out.println("-----------------------------------");
            }
        }
    }
}







/*
public class LokSabha {
    Politician[] politicians = new Politician[12];
    int index;

    public boolean addPolitician(Politician politician) {
        if (politician != null && index < politicians.length) {
            politicians[index++] = politician;
            return true;
        }
        return false;
    }

    public void getAllPoliticians() {
        System.out.println("List of Politicians:");
        for (Politician politician : politicians) {
            if (politician != null) {
                System.out.println("Id: " + politician.getPoliticianId());
                System.out.println("Name: " + politician.getName());
                System.out.println("Party: " + politician.getParty());
                System.out.println("Constituency: " + politician.getConstituency());
                System.out.println("Age: " + politician.getAge());
                System.out.println("State: " + politician.getState());
                System.out.println("Position: " + politician.getPosition());
                System.out.println("Experience: " + politician.getExperienceYears());
                System.out.println("Education: " + politician.getEducation());
                System.out.println("Contact: " + politician.getContact());
                System.out.println("Minister: " + politician.isMinister());
                System.out.println("Term: " + politician.getTerm());
                System.out.println("-----------------------------------");
            }
        }
    }
}*/




