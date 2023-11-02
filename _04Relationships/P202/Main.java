package org.amincia._04Relationships.P202;

import org.amincia._04Relationships.P202.entities.Cinema;
import org.amincia._04Relationships.P202.services.CinemaService;

public class Main {
    public static void main(String[] args) {
        CinemaService cinemaService = new CinemaService();
        cinemaService.createViewers();

        Cinema cinema = cinemaService.createCinema();
        cinemaService.showHall(cinema);
    }
}
