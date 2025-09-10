package com.xworkz.watchshop.watch;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
    public class Watch {

        private int watchId;
        private String brand;
        private String model;
        private double price;
        private String type;
        private String material;
        private String color;
        private boolean waterResistant;
        private String warranty;

    }

