package org.amincia._01POO.Exercises.P114.entities;

import java.util.Arrays;

public class Mobile {
    private String make;
    private float price;
    private String model;
    private int ram;
    private int storage;
    private int[] code;

    public Mobile() {}

    public Mobile(String make, float price, String model, int ram, int storage, int[] code) {
        this.make = make;
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.code = code;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int[] getCode() {
        return code;
    }

    public void setCode(int[] code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "DISPOSITIVO MÓVIL:" +
                "\nMarca: " + make +
                "\nPrecio: " + price +
                "\nModelo: " + model +
                "\nMemoria RAM: " + ram + " GB" +
                "\nAlmacenamiento: " + storage +
                "\nCódigo: " + Arrays.toString(code);
    }
}
