package com.misicode._04Relationships.Exercises.P202;

import com.misicode._04Relationships.Exercises.P202.services.CinemaService;
import com.misicode._04Relationships.Exercises.P202.entities.Cinema;

public class Main {
    public static void main(String[] args) {
        CinemaService cinemaService = new CinemaService();
        cinemaService.createViewers();

        Cinema cinema = cinemaService.createCinema();
        cinemaService.showHall(cinema);
    }
}
