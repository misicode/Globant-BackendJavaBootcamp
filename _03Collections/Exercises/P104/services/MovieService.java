package com.misicode._03Collections.Exercises.P104.services;

import com.misicode._03Collections.Exercises.P104.entities.Movie;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieService {
    Scanner scanner = new Scanner(System.in).useDelimiter("\r?\n");

    public Movie createMovie() {
        Movie movie = new Movie();

        System.out.print("Ingrese el título de la película: ");
        movie.setTitle(scanner.next());
        System.out.print("Ingrese el nombre del director: ");
        movie.setDirector(scanner.next());
        System.out.print("Ingrese la duración: ");
        movie.setDuration(scanner.nextFloat());

        return movie;
    }

    public void addMovies(ArrayList<Movie> moviesList) {
        String resp;

        do {
            moviesList.add(createMovie());
            System.out.print("Desea agregar otra película a la lista (Y-N)? ");
            resp = scanner.next().toUpperCase();
        } while(resp.equals("Y"));
    }

    public void showMovies(ArrayList<Movie> moviesList) {
        System.out.println("\nLISTA DE PELÍCULAS:");
        for(Movie movie: moviesList) {
            System.out.println(movie);
        }
    }

    public void showMoviesLongerHour(ArrayList<Movie> moviesList) {
        System.out.println("\nLISTA DE PELÍCULAS CON DURACIÓN MAYOR A 1 HORA:");
        for(Movie movie: moviesList) {
            if(movie.getDuration() > 1) {
                System.out.println(movie);
            }
        }
    }

    public void sortByDuration(ArrayList<Movie> moviesList) {
        System.out.println("Ordenadas de menor a mayor duración");
        moviesList.sort(new Movie());
    }

    public void sortByDurationReversed(ArrayList<Movie> moviesList) {
        System.out.println("Ordenadas de mayor a menor duración");
        moviesList.sort(new Movie().reversed());
    }
}
