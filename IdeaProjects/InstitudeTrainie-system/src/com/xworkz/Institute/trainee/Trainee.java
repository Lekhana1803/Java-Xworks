package com.xworkz.Institute.trainee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


    public class Trainee {
        private int traineeId;
        private String traineeName;
        private int age;
        private String gender;
        private String course;
        private String batch;
        private String email;
        private String phoneNumber;
        private String address;
        private String qualification;
        private String specialization;
        private String joinDate;
        private String completionDate;
        private double feesPaid;
        private boolean isPlaced;
}