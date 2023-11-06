package org.amincia._04Relationships.Exercises.P201;

import org.amincia._04Relationships.Exercises.P201.services.AdoptService;

public class Main {
    public static void main(String[] args) {
        AdoptService adoptService = new AdoptService();

        adoptService.createDogs();
        adoptService.createPersons();
        adoptService.listDogs();
        adoptService.adoptDogs();
        adoptService.listPersons();
    }
}
