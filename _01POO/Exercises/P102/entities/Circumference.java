package com.misicode._01POO.Exercises.P102.entities;

public class Circumference {
    private double radio;

    public Circumference() {}

    public Circumference(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "CIRCUNFERENCIA:" +
                "\nRadio: " + radio;
    }
}
