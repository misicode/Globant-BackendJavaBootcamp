package org.amincia._04Relationships.P202.entities;

public class Cinema {
    private Movie movie;
    private Viewer[][] hall;
    private double priceCine;

    public Cinema() {}

    public Cinema(Movie movie, Viewer[][] hall, double priceCine) {
        this.movie = movie;
        this.hall = hall;
        this.priceCine = priceCine;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Viewer[][] getHall() {
        return hall;
    }

    public void setHall(Viewer[][] hall) {
        this.hall = hall;
    }

    public double getPriceCine() {
        return priceCine;
    }

    public void setPriceCine(double priceCine) {
        this.priceCine = priceCine;
    }
}
