package org.amincia._05Inheritance.Exercises.P102.services;

import org.amincia._05Inheritance.Exercises.P102.entities.HouseholdAppliance;
import org.amincia._05Inheritance.Exercises.P102.entities.Television;

import java.util.Scanner;

public class TelevisionService extends HouseholdApplianceService {
    Scanner scanner = new Scanner(System.in);

    public Television createTelevision() {
        HouseholdAppliance householdAppliance = createHouseholdAppliance();

        System.out.print("Ingrese la resolución: ");
        int resolution = scanner.nextInt();
        System.out.print("Tiene sintonizador TDT?: ");
        boolean tunerTDT = scanner.nextBoolean();

        return new Television(
                householdAppliance.getPrice(),
                householdAppliance.getColor(),
                householdAppliance.getEnergy(),
                householdAppliance.getWeight(),
                resolution, tunerTDT
        );
    }

    public void finalTelevisionPrice(Television television) {
        super.finalPrice(television);

        if(television.getResolution() > 40) {
            television.setPrice(television.getPrice() * 130 / 100);
        }

        if(television.isTunerTDT()) {
            television.setPrice(television.getPrice()+ 500);
        }

        System.out.println("\nPrecio final del televisor: $" + television.getPrice());
    }
}
