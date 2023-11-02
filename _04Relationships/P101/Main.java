package org.amincia._04Relationships.P101;

import org.amincia._04Relationships.P101.entities.Person;
import org.amincia._04Relationships.P101.services.PersonService;

public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonService();

        System.out.println("Registrando Persona 1");
        Person person1 = personService.createPerson();
        System.out.println("\nRegistrando Persona 2");
        Person person2 = personService.createPerson();

        System.out.println(person1);
        System.out.println(person2);
    }
}
