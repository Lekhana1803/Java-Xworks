package com.xworkz.theatre.movie;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter

public class Movie {
    private int movieId;
    private String title;
    private String director;
    private String genre;
    private int duration; // in minutes
    private String language;
    private double ticketPrice;
    private String releaseDate;
    private String rating;
    private boolean is3D;



}
