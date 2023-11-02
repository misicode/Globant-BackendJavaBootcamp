package org.amincia._04Relationships.P201.entities;

public class Person {
    private String name;
    private Dog dog;

    public Person() {}

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, Dog dog) {
        this(name);
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Persona: " + name + ", " + dog;
    }
}
