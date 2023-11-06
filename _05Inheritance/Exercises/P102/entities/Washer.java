package org.amincia._05Inheritance.Exercises.P102.entities;

public class Washer extends HouseholdAppliance {
    private double burden;

    public Washer() {
        super();
    }

    public Washer(double price, Color color, char energy, int weight, double burden) {
        super(price, color, energy, weight);
        this.burden = burden;
    }

    public double getBurden() {
        return burden;
    }

    public void setBurden(double burden) {
        this.burden = burden;
    }
}
