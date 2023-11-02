package org.amincia._05Inheritance.P102;

import org.amincia._05Inheritance.P102.entities.Television;
import org.amincia._05Inheritance.P102.entities.Washer;
import org.amincia._05Inheritance.P102.services.TelevisionService;
import org.amincia._05Inheritance.P102.services.WasherService;

public class Main {
    public static void main(String[] args) {
        WasherService washerService = new WasherService();
        System.out.println("Registro de lavadora");
        Washer washer = washerService.createWasher();

        TelevisionService televisionService = new TelevisionService();
        System.out.println("\nRegistro de televisor");
        Television television = televisionService.createTelevision();

        washerService.finalWasherPrice(washer);
        televisionService.finalTelevisionPrice(television);
    }
}
