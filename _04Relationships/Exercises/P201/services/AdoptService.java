package com.misicode._04Relationships.Exercises.P201.services;

import com.misicode._04Relationships.Exercises.P201.entities.Dog;
import com.misicode._04Relationships.Exercises.P201.entities.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class AdoptService {
    private ArrayList<Dog> dogsList;
    private ArrayList<Person> personsList;
    Scanner scanner = new Scanner(System.in);

    public void createDogs() {
        dogsList = new ArrayList<>();

        dogsList.add(new Dog("Firulais"));
        dogsList.add(new Dog("Spanky"));
        dogsList.add(new Dog("Linda"));
        dogsList.add(new Dog("Bob"));
    }

    public  void createPersons() {
        personsList = new ArrayList<>();

        personsList.add(new Person("Alicia"));
        personsList.add(new Person("Juan"));
        personsList.add(new Person("Israel"));
        personsList.add(new Person("María"));
    }

    private boolean verifyDogName(Person person, String name) {
        for(Dog dog: dogsList) {
            if(name.equals(dog.getName()) && !dog.isAdopted()) {
                System.out.println("Felicidades! Adoptó a " + dog.getName() + " :)");
                person.setDog(dog);
                dog.setAdopted(true);
                return true;
            }
        }

        System.out.println("Lo lamento, el nombre del perro que ingreso no existe o ya fue adoptado :(");
        return false;
    }

    public void adoptDogs() {
        String dogName;

        for(Person person: personsList) {
            System.out.println("\nPERSONA: " + person.getName());
            do {
                System.out.print("Ingrese el nombre del perro que quiere adoptar: ");
                dogName = scanner.next();
            } while (!verifyDogName(person, dogName));
        }
    }

    public void listDogs() {
        System.out.println("LISTA DE PERROS:");
        for(Dog dog: dogsList) {
            System.out.println(dog);
        }
    }

    public void listPersons() {
        System.out.println("\nLISTA DE PERSONAS:");
        for(Person person: personsList) {
            System.out.println(person);
        }
    }
}
