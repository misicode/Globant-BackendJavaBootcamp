package org.amincia._01POO.Exercises.P104.entities;

public class Rectangle {
    private int base;
    private int height;

    public Rectangle() {}

    public Rectangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "RECTÁNGULO:" +
                "\nBase: " + base +
                "\nAltura: " + height;
    }
}
