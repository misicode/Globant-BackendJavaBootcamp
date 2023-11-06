package org.amincia._04Relationships.Exercises.P202.entities;

public class Viewer {
    private String name;
    private int age;
    private double money;
    private boolean isEntry;

    public Viewer() {}

    public Viewer(String name, int age, double money) {
        this.name = name;
        this.age = age;
        this.money = money;
        this.isEntry = false;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMoney() {
        return money;
    }

    public void setEntry(boolean entry) {
        isEntry = entry;
    }

    @Override
    public String toString() {
        return "ESPECTADOR: [Nombre: " + name + ", Edad: " + age +
                ", Dinero: S/" + money + ", Ingresó?: " + isEntry + "]";
    }
}
