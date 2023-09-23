package _05Inheritance.P101;

import _05Inheritance.P101.entities.Animal;
import _05Inheritance.P101.entities.Cat;
import _05Inheritance.P101.entities.Dog;
import _05Inheritance.P101.entities.Horse;

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
