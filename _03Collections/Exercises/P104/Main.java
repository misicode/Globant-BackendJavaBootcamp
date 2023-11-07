package com.misicode._03Collections.Exercises.P104;

import com.misicode._03Collections.Exercises.P104.entities.Movie;
import com.misicode._03Collections.Exercises.P104.services.MovieService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Movie> moviesList = new ArrayList<>();
        MovieService movieService = new MovieService();

        movieService.addMovies(moviesList);
        movieService.showMovies(moviesList);
        movieService.showMoviesLongerHour(moviesList);
        movieService.sortByDuration(moviesList);
        movieService.showMovies(moviesList);
        movieService.sortByDurationReversed(moviesList);
        movieService.showMovies(moviesList);
    }
}
