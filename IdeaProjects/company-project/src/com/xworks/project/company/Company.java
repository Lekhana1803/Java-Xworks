package com.xworks.project.company;

import com.xworks.project.project.Project;


public class Company {
    public Company(int size){
        projects=new Project[size];
    }

        public Project[] projects;
        int index;

        public boolean addProject(Project project) {
            boolean isAdded = false;
            if (project != null && index < projects.length) {
                projects[index++] = project;
                isAdded = true;
            } else {
                System.out.println("Invalid Project or limit reached");
            }
            return isAdded;
        }

        public void getAllProjects() {
            System.out.println("List of Projects:");
            for (Project project : projects) {
                if (project != null) {
                    System.out.println("Project Id: " + project.getProjectId());
                    System.out.println("Project Name: " + project.getProjectName());
                    System.out.println("Client: " + project.getClientName());
                    System.out.println("Manager: " + project.getProjectManager());
                    System.out.println("Team Size: " + project.getTeamSize());
                    System.out.println("Budget: " + project.getBudget());
                    System.out.println("Start Date: " + project.getStartDate());
                    System.out.println("End Date: " + project.getEndDate());
                    System.out.println("Status: " + project.getStatus());
                    System.out.println("Technology: " + project.getTechnology());
                    System.out.println("Domain: " + project.getDomain());
                    System.out.println("Location: " + project.getLocation());
                    System.out.println("Duration: " + project.getDuration());
                    System.out.println("Sponsor: " + project.getSponsor());
                    System.out.println("Department: " + project.getDepartment());
                    System.out.println("Methodology: " + project.getMethodology());
                    System.out.println("Version: " + project.getVersion());
                    System.out.println("Priority: " + project.getPriority());
                    System.out.println("Description: " + project.getDescription());
                    System.out.println("Remarks: " + project.getRemarks());
                    System.out.println("-----------------------------------");
                }
            }
        }
    }

