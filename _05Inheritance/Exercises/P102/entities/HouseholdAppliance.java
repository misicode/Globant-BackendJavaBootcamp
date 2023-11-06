package org.amincia._05Inheritance.Exercises.P102.entities;

public class HouseholdAppliance {
    private double price;
    private Color color;
    private char energy;
    private int weight;

    public HouseholdAppliance() {}

    public HouseholdAppliance(double price, Color color, char energy, int weight) {
        this.price = price;
        this.color = color;
        this.energy = energy;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public char getEnergy() {
        return energy;
    }

    public void setEnergy(char energy) {
        this.energy = energy;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
