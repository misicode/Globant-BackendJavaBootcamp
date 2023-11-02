package org.amincia._05Inheritance.P101;

import org.amincia._05Inheritance.P101.entities.Animal;
import org.amincia._05Inheritance.P101.entities.Cat;
import org.amincia._05Inheritance.P101.entities.Dog;
import org.amincia._05Inheritance.P101.entities.Horse;

public class Main {
    public static void main(String[] args) {
        Animal dog1 = new Dog("Stich", "Carne", 15, "Doberman");
        dog1.feed();

        Animal dog2 = new Dog("Teddy", "Croquetas", 10, "Chihuahua");
        dog2.feed();

        Animal cat = new Cat("Pelusa", "Galletas", 15, "Siamés");
        cat.feed();

        Animal horse = new Horse("Spark", "Pasto", 25, "Fino");
        horse.feed();
    }
}
