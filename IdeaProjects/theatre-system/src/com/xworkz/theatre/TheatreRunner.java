package com.xworkz.theatre;

import com.xworkz.theatre.Theatre.Theatre;
import com.xworkz.theatre.movie.Movie;

import java.util.Scanner;

public class TheatreRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of movies to be added:");
        int size = scanner.nextInt();

        Theatre theatre = new Theatre(size); // theatre with movie array
        System.out.println("Theatre capacity: " + theatre.movies.length);

        for (int i = 0; i < size; i++) {
            Movie movie = new Movie();

            System.out.println("Enter movie id:");
            movie.setMovieId(scanner.nextInt());

            System.out.println("Enter movie title:");
            movie.setTitle(scanner.next());

            System.out.println("Enter director name:");
            movie.setDirector(scanner.next());

            System.out.println("Enter genre:");
            movie.setGenre(scanner.next());

            System.out.println("Enter duration (minutes):");
            movie.setDuration(scanner.nextInt());

            System.out.println("Enter language:");
            movie.setLanguage(scanner.next());

            System.out.println("Enter ticket price:");
            movie.setTicketPrice(scanner.nextDouble());

            System.out.println("Enter release date (yyyy-mm-dd):");
            movie.setReleaseDate(scanner.next());

            System.out.println("Enter rating (like UA/PG-13):");
            movie.setRating(scanner.next());

            System.out.println("Is it 3D? (true/false):");
            movie.set3D(scanner.nextBoolean());

            theatre.addMovie(movie);
        }

        theatre.getAllMovies();
    }
}



/*
public class TheatreRunner {
    public static void main(String[] args) {
        Theatre theatre = new Theatre();

        Movie m1 = new Movie();
        m1.setMovieId(1);
        m1.setTitle("Inception");
        m1.setDirector("Christopher Nolan");
        m1.setGenre("Sci-Fi");
        m1.setDuration(148);
        m1.setLanguage("English");
        m1.setTicketPrice(300);
        m1.setReleaseDate("2010-07-16");
        m1.setRating("PG-13");
        m1.set3D(false);
        theatre.addMovie(m1);

        Movie m2 = new Movie();
        m2.setMovieId(2);
        m2.setTitle("RRR");
        m2.setDirector("S. S. Rajamouli");
        m2.setGenre("Action");
        m2.setDuration(180);
        m2.setLanguage("Telugu");
        m2.setTicketPrice(250);
        m2.setReleaseDate("2022-03-25");
        m2.setRating("UA");
        m2.set3D(false);
        theatre.addMovie(m2);


        theatre.getAllMovies();
    }
}*/
