package _03Collections.P104.entities;

import java.util.Comparator;

public class Movie implements Comparator<Movie> {
    private String title;
    private String director;
    private Float duration;

    public Movie() {}

    public Movie(String title, String director, Float duration) {
        this.title = title;
        this.director = director;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Float getDuration() {
        return duration;
    }

    public void setDuration(Float duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "PELÍCULA:" +
                "\nTítulo: " + title +
                "\nDirector: " + director +
                "\nDuración: " + duration;
    }

    @Override
    public int compare(Movie movie1, Movie movie2) {
        return movie1.getDuration().compareTo(movie2.getDuration());
    }
}
