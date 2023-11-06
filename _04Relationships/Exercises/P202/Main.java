package org.amincia._04Relationships.Exercises.P202;

import org.amincia._04Relationships.Exercises.P202.services.CinemaService;
import org.amincia._04Relationships.Exercises.P202.entities.Cinema;

public class Main {
    public static void main(String[] args) {
        CinemaService cinemaService = new CinemaService();
        cinemaService.createViewers();

        Cinema cinema = cinemaService.createCinema();
        cinemaService.showHall(cinema);
    }
}
