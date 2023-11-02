package org.amincia._04Relationships.P101.services;

import org.amincia._04Relationships.P101.entities.Dog;
import org.amincia._04Relationships.P101.entities.Person;

import java.util.Scanner;

public class PersonService {
    DogService dogService = new DogService();
    Scanner scanner = new Scanner(System.in).useDelimiter("\r?\n");

    public Person createPerson() {
        Person person = new Person();

        System.out.print("Ingrese el nombre: ");
        person.setName(scanner.next());
        System.out.print("Ingrese el apellido: ");
        person.setLastname(scanner.next());
        System.out.print("Ingrese la edad: ");
        person.setAge(scanner.nextInt());
        System.out.print("Ingrese el documento de identidad: ");
        person.setIdDoc(scanner.next());
        System.out.println("Datos de la mascota");
        Dog dog = dogService.createDog();
        person.setDog(dog);

        return person;
    }
}
