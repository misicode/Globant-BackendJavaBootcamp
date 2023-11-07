package com.misicode._05Inheritance.Exercises.P103;

import com.misicode._05Inheritance.Exercises.P102.entities.Color;
import com.misicode._05Inheritance.Exercises.P102.entities.HouseholdAppliance;
import com.misicode._05Inheritance.Exercises.P102.entities.Television;
import com.misicode._05Inheritance.Exercises.P102.entities.Washer;
import com.misicode._05Inheritance.Exercises.P102.services.TelevisionService;
import com.misicode._05Inheritance.Exercises.P102.services.WasherService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<HouseholdAppliance> householdAppliances = new ArrayList<>();
        WasherService washerService = new WasherService();
        TelevisionService televisionService = new TelevisionService();
        double washersPrice = 0, televisionsPrice = 0;

        householdAppliances.add(new Washer(1000, Color.A, 'B', 50, 30));
        householdAppliances.add(new Washer(1000, Color.G, 'A', 90, 50));
        householdAppliances.add(new Television(1000, Color.B, 'D', 20, 42, true));
        householdAppliances.add(new Television(1000, Color.N, 'C', 35, 65, false));

        for(HouseholdAppliance householdAppliance: householdAppliances) {
            if(householdAppliance instanceof Washer washer) {
                washerService.finalWasherPrice(washer);
                washersPrice += washer.getPrice();
            }
            if(householdAppliance instanceof Television television) {
                televisionService.finalTelevisionPrice(television);
                televisionsPrice += television.getPrice();
            }
        }

        System.out.println("\nPrecio de Electrodomésticos: $" + (washersPrice + televisionsPrice));
        System.out.println("Precio de Lavadoras: $" + washersPrice);
        System.out.println("Precio de Televisores: $" + televisionsPrice);
    }
}
