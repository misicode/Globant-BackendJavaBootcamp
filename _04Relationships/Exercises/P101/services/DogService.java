package org.amincia._04Relationships.Exercises.P101.services;

import org.amincia._04Relationships.Exercises.P101.entities.Dog;

import java.util.Scanner;

public class DogService {
    Scanner scanner = new Scanner(System.in).useDelimiter("\r?\n");

    public Dog createDog() {
        Dog dog = new Dog();

        System.out.print("Ingrese el nombre del perro: ");
        dog.setName(scanner.next());
        System.out.print("Ingrese la raza del perro: ");
        dog.setBreed(scanner.next());
        System.out.print("Ingrese la edad del perro: ");
        dog.setAge(scanner.nextInt());
        System.out.print("Ingrese el tamaño del perro (kg): ");
        dog.setSize(scanner.nextDouble());

        return dog;
    }
}
