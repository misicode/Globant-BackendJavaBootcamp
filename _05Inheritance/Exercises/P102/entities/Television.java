package com.misicode._05Inheritance.Exercises.P102.entities;

public class Television extends HouseholdAppliance {
    private int resolution;
    private boolean tunerTDT;

    public Television() {
        super();
    }

    public Television(double price, Color color, char energy, int weight, int resolution, boolean tunerTDT) {
        super(price, color, energy, weight);
        this.resolution = resolution;
        this.tunerTDT = tunerTDT;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public boolean isTunerTDT() {
        return tunerTDT;
    }

    public void setTunerTDT(boolean tunerTDT) {
        this.tunerTDT = tunerTDT;
    }
}
