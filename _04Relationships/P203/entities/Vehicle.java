package org.amincia._04Relationships.P203.entities;

public class Vehicle {
    private String brand;
    private String model;
    private int year;
    private int engineNum;
    private String chassis;
    private String color;
    private String type;

    public Vehicle() {}

    public Vehicle(String brand, String model, int year, int engineNum, String chassis, String color, String type) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engineNum = engineNum;
        this.chassis = chassis;
        this.color = color;
        this.type = type;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setEngineNum(int engineNum) {
        this.engineNum = engineNum;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "VEHÍCULO:" +
                "\nMarca: " + brand +
                "\nModelo: " + model +
                "\nAño: " + year +
                "\nNúmero de motor: " + engineNum +
                "\nChasis: " + chassis +
                "\nColor: " + color +
                "\nTipo: " + type;
    }
}
