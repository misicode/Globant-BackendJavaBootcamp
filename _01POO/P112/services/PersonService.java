package org.amincia._01POO.P112.services;

import org.amincia._01POO.P112.entities.Person;

import java.util.Calendar;
import java.util.Scanner;

public class PersonService {
    Scanner scanner = new Scanner(System.in);

    public Person createPerson() {
        Person person = new Person();

        System.out.print("Ingrese el nombre: ");
        person.setName(scanner.nextLine());

        System.out.println("Ingrese la fecha de nacimiento");
        System.out.print("Día: ");
        int day = scanner.nextInt();
        System.out.print("Mes: ");
        int month = scanner.nextInt() - 1;
        System.out.print("Año: ");
        int year = scanner.nextInt();
        Calendar birthCalendar = Calendar.getInstance();
        birthCalendar.set(year, month, day);
        person.setBirthdate(birthCalendar);

        return person;
    }

    public int calculateAge(Person person) {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.YEAR) - person.getBirthdate().get(Calendar.YEAR);
    }

    public void compareAge(Person person, int age) {
        if(calculateAge(person) > age) {
            System.out.println("La edad de " + person.getName() + " es mayor a " + age + " años");
        } else {
            System.out.println("La edad de " + person.getName() + " es menor a " + age + " años");
        }
    }
}
