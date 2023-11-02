package org.amincia._01POO.P107;

import org.amincia._01POO.P107.entities.Person;
import org.amincia._01POO.P107.services.PersonService;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Integer> promIMC = new HashMap<>();
        HashMap<Boolean, Integer> promAdult = new HashMap<>();
        PersonService personService = new PersonService();
        Person[] persons = new Person[4];

        for(int i = 0; i < persons.length; i++) {
            System.out.println("===================================");
            System.out.println("PERSONA " + (i+1));
            persons[i] = personService.createPerson();
        }

        promIMC.put(-1,0);
        promIMC.put(0,0);
        promIMC.put(1,0);
        promAdult.put(true, 0);
        promAdult.put(false, 0);

        System.out.println("===================================");
        System.out.println("RESULTADOS");
        for(Person person: persons) {
            System.out.println("-----------------------------------");
            System.out.println("PERSONA: " + person.getName());
            System.out.println("Cálculo IMC");
            int imc = personService.calculateIMC(person);
            promIMC.put(imc, promIMC.get(imc) + 1);
            System.out.println("¿Es mayor de edad?");
            boolean isAdult = personService.isAdult(person);
            promAdult.put(isAdult, promAdult.get(isAdult) + 1);
        }

        int aux = 100/4;
        System.out.println("===================================");
        System.out.println("PORCENTAJES");
        System.out.println("Peso debajo del ideal: " + (promIMC.get(-1) * aux) + "% (" + promIMC.get(-1) + ")");
        System.out.println("Peso ideal: " + (promIMC.get(0) * aux) + "% (" + promIMC.get(0) + ")");
        System.out.println("Peso encima del ideal: " + (promIMC.get(1) * aux) + "% (" + promIMC.get(1) + ")");
        System.out.println("Menores de edad: " + (promAdult.get(true) * aux) + "% (" + promAdult.get(true) + ")");
        System.out.println("Mayores de edad: " + (promAdult.get(false) * aux) + "% (" + promAdult.get(false) + ")");
    }
}
