package org.amincia._04Relationships.P101.entities;

public class Dog {
    private String name;
    private String breed;
    private int age;
    private double size;

    public Dog() {}

    public Dog(String name, String breed, int age, double size) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "PERRO:" +
                "\nNombre: " + name +
                "\nRaza: " + breed +
                "\nEdad: " + age +
                "\nTamaño: " + size;
    }
}
