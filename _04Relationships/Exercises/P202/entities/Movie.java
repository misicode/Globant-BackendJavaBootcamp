package com.misicode._04Relationships.Exercises.P202.entities;

public class Movie {
    private String title;
    private float duration;
    private int minAge;
    private String director;

    public Movie() {}

    public Movie(String title, float duration, int minAge, String director) {
        this.title = title;
        this.duration = duration;
        this.minAge = minAge;
        this.director = director;
    }

    public int getMinAge() {
        return minAge;
    }

    @Override
    public String toString() {
        return "PELÍCULA: [Título: " + title + ", Duración: " + duration +
                "h , Edad mínima: " + minAge + ", Director: " + director + "]";
    }
}
