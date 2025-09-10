package com.xworkz.loksabha.politician;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Politician {
    private int politicianId;
    private String name;
    private String party;
    private String constituency;
    private int age;
    private String state;
    private String position;
    private int experienceYears;
    private String education;
    private String contact;
    private boolean isMinister;
    private String term;

}
