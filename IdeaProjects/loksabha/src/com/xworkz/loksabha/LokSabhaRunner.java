package com.xworkz.loksabha;

import com.xworkz.loksabha.loksabha.LokSabha;
import com.xworkz.loksabha.politician.Politician;

import java.util.Scanner;

public class LokSabhaRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of politicians to be added:");
        int size = scanner.nextInt();

        LokSabha lokSabha = new LokSabha(size);
        System.out.println("LokSabha capacity: " + lokSabha.politicians.length);

        for (int i = 0; i < size; i++) {
            Politician politician = new Politician();

            System.out.println("Enter Politician ID:");
            politician.setPoliticianId(scanner.nextInt());

            System.out.println("Enter Politician Name:");
            politician.setName(scanner.next());

            System.out.println("Enter Party:");
            politician.setParty(scanner.next());

            System.out.println("Enter Constituency:");
            politician.setConstituency(scanner.next());

            System.out.println("Enter Age:");
            politician.setAge(scanner.nextInt());

            System.out.println("Enter State:");
            politician.setState(scanner.next());

            System.out.println("Enter Position:");
            politician.setPosition(scanner.next());

            System.out.println("Enter Experience Years:");
            politician.setExperienceYears(scanner.nextInt());

            System.out.println("Enter Education:");
            politician.setEducation(scanner.next());

            System.out.println("Enter Contact:");
            politician.setContact(scanner.next());

            System.out.println("Is Minister? (true/false):");
            politician.setMinister(scanner.nextBoolean());

            System.out.println("Enter Term (yyyy-yyyy):");
            politician.setTerm(scanner.next());

            lokSabha.addPolitician(politician);
        }

        lokSabha.getAllPoliticians();
    }
}





/*
public class LokSabhaRunner {

    public static void main(String[] args) {

        LokSabha lokSabha = new LokSabha();

        // Politician 1
        Politician p1 = new Politician();
        p1.setPoliticianId(1);
        p1.setName("Narendra Modi");
        p1.setParty("BJP");
        p1.setConstituency("Varanasi");
        p1.setAge(74);
        p1.setState("Uttar Pradesh");
        p1.setPosition("Prime Minister");
        p1.setExperienceYears(30);
        p1.setEducation("BA Political Science");
        p1.setContact("9876500001");
        p1.setMinister(true);
        p1.setTerm("2019-2024");
        lokSabha.addPolitician(p1);

        // Politician 2
        Politician p2 = new Politician();
        p2.setPoliticianId(2);
        p2.setName("Rahul Gandhi");
        p2.setParty("INC");
        p2.setConstituency("Wayanad");
        p2.setAge(52);
        p2.setState("Kerala");
        p2.setPosition("MP");
        p2.setExperienceYears(15);
        p2.setEducation("MA Politics");
        p2.setContact("9876500002");
        p2.setMinister(false);
        p2.setTerm("2019-2024");
        lokSabha.addPolitician(p2);

        // Politician 3
        Politician p3 = new Politician();
        p3.setPoliticianId(3);
        p3.setName("Amit Shah");
        p3.setParty("BJP");
        p3.setConstituency("Gandhinagar");
        p3.setAge(60);
        p3.setState("Gujarat");
        p3.setPosition("Home Minister");
        p3.setExperienceYears(25);
        p3.setEducation("B.Sc. Biochemistry");
        p3.setContact("9876500003");
        p3.setMinister(true);
        p3.setTerm("2019-2024");
        lokSabha.addPolitician(p3);

        // Politician 4
        Politician p4 = new Politician();
        p4.setPoliticianId(4);
        p4.setName("Sonia Gandhi");
        p4.setParty("INC");
        p4.setConstituency("Rae Bareli");
        p4.setAge(73);
        p4.setState("Uttar Pradesh");
        p4.setPosition("MP");
        p4.setExperienceYears(20);
        p4.setEducation("Diploma in Foreign Languages");
        p4.setContact("9876500004");
        p4.setMinister(false);
        p4.setTerm("2019-2024");
        lokSabha.addPolitician(p4);

        // Politician 5
        Politician p5 = new Politician();
        p5.setPoliticianId(5);
        p5.setName("Arvind Kejriwal");
        p5.setParty("AAP");
        p5.setConstituency("New Delhi");
        p5.setAge(56);
        p5.setState("Delhi");
        p5.setPosition("Chief Minister");
        p5.setExperienceYears(10);
        p5.setEducation("B.Tech, IIT Kharagpur");
        p5.setContact("9876500005");
        p5.setMinister(false);
        p5.setTerm("2020-2025");
        lokSabha.addPolitician(p5);

        // Politician 6
        Politician p6 = new Politician();
        p6.setPoliticianId(6);
        p6.setName("Nirmala Sitharaman");
        p6.setParty("BJP");
        p6.setConstituency("Rajya Sabha");
        p6.setAge(64);
        p6.setState("Karnataka");
        p6.setPosition("Finance Minister");
        p6.setExperienceYears(12);
        p6.setEducation("MA Economics");
        p6.setContact("9876500006");
        p6.setMinister(true);
        p6.setTerm("2019-2024");
        lokSabha.addPolitician(p6);

        // Politician 7
        Politician p7 = new Politician();
        p7.setPoliticianId(7);
        p7.setName("Smriti Irani");
        p7.setParty("BJP");
        p7.setConstituency("Amethi");
        p7.setAge(48);
        p7.setState("Uttar Pradesh");
        p7.setPosition("Minister of Women & Child Development");
        p7.setExperienceYears(10);
        p7.setEducation("Graduate");
        p7.setContact("9876500007");
        p7.setMinister(true);
        p7.setTerm("2019-2024");
        lokSabha.addPolitician(p7);

        // Politician 8
        Politician p8 = new Politician();
        p8.setPoliticianId(8);
        p8.setName("Sharad Pawar");
        p8.setParty("NCP");
        p8.setConstituency("Baramati");
        p8.setAge(83);
        p8.setState("Maharashtra");
        p8.setPosition("Senior Leader");
        p8.setExperienceYears(40);
        p8.setEducation("Graduate");
        p8.setContact("9876500008");
        p8.setMinister(false);
        p8.setTerm("2019-2024");
        lokSabha.addPolitician(p8);

        // Politician 9
        Politician p9 = new Politician();
        p9.setPoliticianId(9);
        p9.setName("Mamata Banerjee");
        p9.setParty("TMC");
        p9.setConstituency("Kolkata");
        p9.setAge(68);
        p9.setState("West Bengal");
        p9.setPosition("Chief Minister");
        p9.setExperienceYears(25);
        p9.setEducation("MA Islamic History");
        p9.setContact("9876500009");
        p9.setMinister(false);
        p9.setTerm("2019-2024");
        lokSabha.addPolitician(p9);

        // Politician 10
        Politician p10 = new Politician();
        p10.setPoliticianId(10);
        p10.setName("Yogi Adityanath");
        p10.setParty("BJP");
        p10.setConstituency("Gorakhpur");
        p10.setAge(52);
        p10.setState("Uttar Pradesh");
        p10.setPosition("Chief Minister");
        p10.setExperienceYears(20);
        p10.setEducation("B.Sc. Mathematics");
        p10.setContact("9876500010");
        p10.setMinister(false);
        p10.setTerm("2017-2027");
        lokSabha.addPolitician(p10);

        // Politician 11
        Politician p11 = new Politician();
        p11.setPoliticianId(11);
        p11.setName("Akhilesh Yadav");
        p11.setParty("SP");
        p11.setConstituency("Azamgarh");
        p11.setAge(50);
        p11.setState("Uttar Pradesh");
        p11.setPosition("Party President");
        p11.setExperienceYears(15);
        p11.setEducation("M.Engg. Sydney");
        p11.setContact("9876500011");
        p11.setMinister(false);
        p11.setTerm("2019-2024");
        lokSabha.addPolitician(p11);

        // Politician 12
        Politician p12 = new Politician();
        p12.setPoliticianId(12);
        p12.setName("MK Stalin");
        p12.setParty("DMK");
        p12.setConstituency("Chennai Central");
        p12.setAge(71);
        p12.setState("Tamil Nadu");
        p12.setPosition("Chief Minister");
        p12.setExperienceYears(25);
        p12.setEducation("BA History");
        p12.setContact("9876500012");
        p12.setMinister(false);
        p12.setTerm("2021-2026");
        lokSabha.addPolitician(p12);

        // Display all politicians
        lokSabha.getAllPoliticians();
    }
}*/