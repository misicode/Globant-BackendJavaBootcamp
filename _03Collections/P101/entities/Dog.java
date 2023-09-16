package _03Collections.P101.entities;

import java.util.Comparator;

public class Dog implements Comparator<Dog> {
    private String breed;

    public Dog() {}

    public Dog(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "PERRO: " + breed;
    }

    @Override
    public int compare(Dog dog1, Dog dog2) {
        return dog1.getBreed().compareTo(dog2.getBreed());
    }
}
