package org.amincia._05Inheritance.P102.services;

import org.amincia._05Inheritance.P102.entities.HouseholdAppliance;
import org.amincia._05Inheritance.P102.entities.Washer;

import java.util.Scanner;

public class WasherService extends HouseholdApplianceService {
    Scanner scanner = new Scanner(System.in);

    public Washer createWasher() {
        HouseholdAppliance householdAppliance = createHouseholdAppliance();

        System.out.print("Ingrese la carga: ");
        double burden = scanner.nextDouble();

        return new Washer(
                householdAppliance.getPrice(),
                householdAppliance.getColor(),
                householdAppliance.getEnergy(),
                householdAppliance.getWeight(),
                burden
        );
    }

    public void finalWasherPrice(Washer washer) {
        super.finalPrice(washer);

        if(washer.getBurden() > 30) {
            washer.setPrice(washer.getPrice() + 500);
        }

        System.out.println("\nPrecio final de la lavadora: $" + washer.getPrice());
    }
}
