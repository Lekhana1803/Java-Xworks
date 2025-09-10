package com.xworkz.police;

import com.xworkz.police.police.Police;
import com.xworkz.police.policestation.PoliceStation;

import java.util.Scanner;

public class PoliceStationRunner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of police officers to be added:");
        int size = scanner.nextInt();

        PoliceStation station = new PoliceStation(size);
        System.out.println("Police array capacity: " + station.polices.length);

        for (int i = 0; i < size; i++) {
            Police police = new Police();

            System.out.println("Enter Police ID:");
            police.setPoliceId(scanner.nextInt());

            System.out.println("Enter Name:");
            police.setName(scanner.next());

            System.out.println("Enter Rank:");
            police.setRank(scanner.next());

            System.out.println("Enter Age:");
            police.setAge(scanner.nextInt());

            System.out.println("Enter Gender:");
            police.setGender(scanner.next());

            System.out.println("Is on Duty? (true/false):");
            police.setOnDuty(scanner.nextBoolean());

            station.addPolice(police);
        }

        station.getAllPolices();
    }
}



/*
public class PoliceStationRunner {
    public static void main(String[] args) {

        PoliceStation station = new PoliceStation();

        Police police1 = new Police();
        police1.setPoliceId(1);
        police1.setName("Ramesh");

        Police police2 = new Police();
        police2.setPoliceId(2);
        police2.setName("Suresh");

        Police police3 = new Police();
        police3.setPoliceId(3);
        police3.setName("Mahesh");

        Police police4 = new Police();
        police4.setPoliceId(4);
        police4.setName("Rajesh");

        Police police5 = new Police();
        police5.setPoliceId(5);
        police5.setName("Ganesh");

        Police police6 = new Police();
        police6.setPoliceId(6);
        police6.setName("Umesh");

        station.addPolice(police1);
        station.addPolice(police2);
        station.addPolice(police3);
        station.addPolice(police4);
        station.addPolice(police5);
        station.addPolice(police6);

        station.getAllPolices();

        System.out.println("police id"+police1.getPoliceId());
    }
}*/
