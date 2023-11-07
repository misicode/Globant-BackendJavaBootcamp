package com.misicode._01POO.Exercises.P107.services;

import com.misicode._01POO.Exercises.P107.entities.Gender;
import com.misicode._01POO.Exercises.P107.entities.Person;

import java.util.Scanner;

public class PersonService {
    Scanner scanner = new Scanner(System.in);

    public Person createPerson() {
        Person person = new Person();
        Gender gender;

        System.out.print("Ingrese el nombre: ");
        person.setName(scanner.next());
        System.out.print("Ingrese la edad: ");
        person.setAge(scanner.nextInt());
        do {
            System.out.print("Ingrese el sexo (H, M, O): ");
            gender = validateGender(scanner.next().toUpperCase());
        } while(gender == null);
        person.setGender(gender);
        System.out.print("Ingrese el peso: ");
        person.setWeight(scanner.nextFloat());
        System.out.print("Ingrese la altura: ");
        person.setHeight(scanner.nextFloat());

        return person;
    }

    private Gender validateGender(String character) {
        for(Gender gender: Gender.values()) {
            if(gender.name().equals(character)) {
                return gender;
            }
        }
        System.out.println("Carácter inválido!");
        return null;
    }

    public int calculateIMC(Person person) {
        float idealWeight = (float) (person.getWeight() / Math.pow(person.getHeight(), 2));

        if(idealWeight < 20) {
            System.out.println("Se encuentra por debajo de su peso ideal");
            return -1;
        } else if(idealWeight <=25) {
            System.out.println("Se encuentra en su peso ideal");
            return 0;
        } else {
            System.out.println("Se encuentra por encima de su peso ideal");
            System.out.println("Condición: Sobrepeso");
            return 1;
        }
    }

    public boolean isAdult(Person person) {
        int age = person.getAge();
        System.out.print("Edad: " + age + ". ");

        if(age < 18) {
            System.out.println("No es mayor de edad");
            return false;
        } else {
            System.out.println("Si es mayor de edad");
            return true;
        }
    }
}
