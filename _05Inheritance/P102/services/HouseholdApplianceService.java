package org.amincia._05Inheritance.P102.services;

import org.amincia._05Inheritance.P102.entities.Color;
import org.amincia._05Inheritance.P102.entities.HouseholdAppliance;

import java.util.Scanner;

public class HouseholdApplianceService {
    Scanner scanner = new Scanner(System.in).useDelimiter("\r?\n");

    private char checkEnergyConsumption(char energy) {
        if("ABCDEF".contains(String.valueOf(energy))) {
            return energy;
        }
        return 'F';
    }

    private Color checkColor(String colorName) {
        for(Color color: Color.values()) {
            if(color.name().equals(colorName.toUpperCase())) {
                return color;
            }
        }
        return Color.B;
    }

    public HouseholdAppliance createHouseholdAppliance() {
        HouseholdAppliance householdAppliance = new HouseholdAppliance();
        int weight;

        householdAppliance.setPrice(1000);
        System.out.print("Ingrese el color (blanco, negro, rojo, azul o gris): ");
        householdAppliance.setColor(checkColor(scanner.next()));
        System.out.print("Ingrese el consumo de energía (A, B, C, D, E o F): ");
        householdAppliance.setEnergy(checkEnergyConsumption(scanner.next().charAt(0)));
        do {
            System.out.print("Ingrese el peso (min 1kg): ");
            weight = scanner.nextInt();
        } while(weight <= 0);
        householdAppliance.setWeight(weight);

        return householdAppliance;
    }

    public void finalPrice(HouseholdAppliance householdAppliance) {
        double currentPrice = householdAppliance.getPrice();

        if(householdAppliance.getEnergy() == 'A') {
            currentPrice += 1000;
        } else if(householdAppliance.getEnergy() == 'B') {
            currentPrice += 800;
        } else if(householdAppliance.getEnergy() == 'C') {
            currentPrice += 600;
        } else if(householdAppliance.getEnergy() == 'D') {
            currentPrice += 500;
        } else if(householdAppliance.getEnergy() == 'E') {
            currentPrice += 300;
        } else {
            currentPrice += 100;
        }

        if(householdAppliance.getWeight() <= 19) {
            currentPrice += 100;
        } else if(householdAppliance.getWeight() <= 49) {
            currentPrice += 500;
        } else if(householdAppliance.getWeight() <= 79) {
            currentPrice += 800;
        } else {
            currentPrice += 1000;
        }

        householdAppliance.setPrice(currentPrice);
    }
}
