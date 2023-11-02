package org.amincia._01POO.P112;

import org.amincia._01POO.P112.entities.Person;
import org.amincia._01POO.P112.services.PersonService;

public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonService();
        Person person = personService.createPerson();

        System.out.println(person);
        System.out.println("La persona tiene: " + personService.calculateAge(person) + " años");
        personService.compareAge(person, 25);
    }
}
