package _04Relationships.P202;

import _04Relationships.P202.entities.Cinema;
import _04Relationships.P202.services.CinemaService;

public class Main {
    public static void main(String[] args) {
        CinemaService cinemaService = new CinemaService();
        cinemaService.createViewers();

        Cinema cinema = cinemaService.createCinema();
        cinemaService.showHall(cinema);
    }
}
