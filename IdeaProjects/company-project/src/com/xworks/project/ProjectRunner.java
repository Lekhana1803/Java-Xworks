package com.xworks.project;

import com.xworks.project.company.Company;
import com.xworks.project.project.Project;

import java.util.Scanner;
public class ProjectRunner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of projects to be added:");
        int size = scanner.nextInt();

        Company company = new Company(size);  // company with project array
        System.out.println("Projects available capacity: " + company.projects.length);

        for (int i = 0; i < size; i++) {
            Project project = new Project();

            System.out.println("Enter project id:");
            project.setProjectId(scanner.nextInt());

            System.out.println("Enter project name:");
            project.setProjectName(scanner.next());

            System.out.println("Enter client name:");
            project.setClientName(scanner.next());

            System.out.println("Enter project manager name:");
            project.setProjectManager(scanner.next());

            System.out.println("Enter team size:");
            project.setTeamSize(scanner.nextInt());

            System.out.println("Enter budget:");
            project.setBudget(scanner.nextDouble());

            System.out.println("Enter start date (yyyy-mm-dd):");
            project.setStartDate(scanner.next());

            System.out.println("Enter end date (yyyy-mm-dd):");
            project.setEndDate(scanner.next());

            System.out.println("Enter status:");
            project.setStatus(scanner.next());

            System.out.println("Enter technology used:");
            project.setTechnology(scanner.next());

            System.out.println("Enter domain:");
            project.setDomain(scanner.next());

            System.out.println("Enter location:");
            project.setLocation(scanner.next());

            System.out.println("Enter duration:");
            project.setDuration(scanner.next());

            System.out.println("Enter sponsor:");
            project.setSponsor(scanner.next());

            System.out.println("Enter department:");
            project.setDepartment(scanner.next());

            System.out.println("Enter methodology:");
            project.setMethodology(scanner.next());

            System.out.println("Enter version:");
            project.setVersion(scanner.next());

            System.out.println("Enter priority:");
            project.setPriority(scanner.next());

            System.out.println("Enter description:");
            project.setDescription(scanner.next());

            System.out.println("Enter remarks:");
            project.setRemarks(scanner.next());

            company.addProject(project);
        }

        company.getAllProjects();
    }
}



          /*  //Example Project 1
            Project project1 = new Project();
            project1.setProjectId(1);
            project1.setProjectName("E-Commerce Platform");
            project1.setClientName("Amazon");
            project1.setProjectManager("Alice");
            project1.setTeamSize(15);
            project1.setBudget(500000.0);
            project1.setStartDate("2025-01-01");
            project1.setEndDate("2025-06-01");
            project1.setStatus("In Progress");
            project1.setTechnology("Java, Spring Boot");
            project1.setDomain("Retail");
            project1.setLocation("Bangalore");
            project1.setDuration("6 months");
            project1.setSponsor("Global Tech");
            project1.setDepartment("IT");
            project1.setMethodology("Agile");
            project1.setVersion("v1.0");
            project1.setPriority("High");
            project1.setDescription("Building an online shopping platform.");
            project1.setRemarks("Critical project for Q1 2025");
            company.addProject(project1);

            // Example Project 2
            Project project2 = new Project();
            project2.setProjectId(2);
            project2.setProjectName("Banking App");
            project2.setClientName("HDFC Bank");
            project2.setProjectManager("Bob");
            project2.setTeamSize(12);
            project2.setBudget(750000.0);
            project2.setStartDate("2025-02-01");
            project2.setEndDate("2025-08-01");
            project2.setStatus("Not Started");
            project2.setTechnology("Python, Django");
            project2.setDomain("Finance");
            project2.setLocation("Mumbai");
            project2.setDuration("7 months");
            project2.setSponsor("Banking Corp");
            project2.setDepartment("Finance Tech");
            project2.setMethodology("Waterfall");
            project2.setVersion("v2.0");
            project2.setPriority("Medium");
            project2.setDescription("Mobile banking application.");
            project2.setRemarks("To be started soon");
            company.addProject(project2);


            company.getAllProjects();
        }
    }*/

