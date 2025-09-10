package com.xworkz.theatre.Theatre;

import com.xworkz.theatre.movie.Movie;

public class Theatre {
    public Movie[] movies;
    int index;

    public Theatre(int size) {
        movies = new Movie[size];
    }

    public boolean addMovie(Movie movie) {
        if (movie != null && index < movies.length) {
            movies[index++] = movie;
            return true;
        }
        System.out.println("Invalid Movie or Theatre full!");
        return false;
    }

    public void getAllMovies() {
        System.out.println("List of Movies:");
        for (Movie movie : movies) {
            if (movie != null) {
                System.out.println("Movie Id: " + movie.getMovieId());
                System.out.println("Title: " + movie.getTitle());
                System.out.println("Director: " + movie.getDirector());
                System.out.println("Genre: " + movie.getGenre());
                System.out.println("Duration: " + movie.getDuration() + " mins");
                System.out.println("Language: " + movie.getLanguage());
                System.out.println("Ticket Price: ₹" + movie.getTicketPrice());
                System.out.println("Release Date: " + movie.getReleaseDate());
                System.out.println("Rating: " + movie.getRating());
                System.out.println("3D Available: " + (movie.is3D()));
                System.out.println("-----------------------------------");
            }
        }
    }
}


/*
public class Theatre {
    Movie[] movies = new Movie[10];
    int index;

    public boolean addMovie(Movie movie) {
        if (movie != null && index < movies.length) {
            movies[index++] = movie;
            return true;
        }
        return false;
    }

    public void getAllMovies() {
        System.out.println("Now Showing:");
        for (Movie movie : movies) {
            if (movie != null) {
                System.out.println("Id: " + movie.getMovieId());
                System.out.println("Title: " + movie.getTitle());
                System.out.println("Director: " + movie.getDirector());
                System.out.println("Genre: " + movie.getGenre());
                System.out.println("Duration: " + movie.getDuration());
                System.out.println("Language: " + movie.getLanguage());
                System.out.println("Price: " + movie.getTicketPrice());
                System.out.println("Release Date: " + movie.getReleaseDate());
                System.out.println("Rating: " + movie.getRating());
                System.out.println("3D: " + movie.is3D());
                System.out.println("-----------------------------------");
            }
        }
    }
}*/
