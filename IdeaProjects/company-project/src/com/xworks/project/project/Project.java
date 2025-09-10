package com.xworks.project.project;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Project {

    private int projectId;
    private String projectName;
    private String clientName;
    private String projectManager;
    private int teamSize;
    private double budget;
    private String startDate;
    private String endDate;
    private String status;
    private String technology;
    private String domain;
    private String location;
    private String duration;
    private String sponsor;
    private String department;
    private String methodology;
    private String version;
    private String priority;
    private String description;
    private String remarks;

}
