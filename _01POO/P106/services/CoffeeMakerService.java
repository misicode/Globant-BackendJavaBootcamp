package org.amincia._01POO.P106.services;

import org.amincia._01POO.P106.entities.CoffeeMaker;

import java.util.Scanner;

public class CoffeeMakerService {
    Scanner scanner = new Scanner(System.in);

    public CoffeeMaker createCoffeMaker() {
        CoffeeMaker coffeeMaker = new CoffeeMaker();

        System.out.print("Ingrese la capacidad máxima: ");
        coffeeMaker.setMaxCapacity(scanner.nextFloat());
        System.out.print("Ingrese la cantidad actual: ");
        coffeeMaker.setCurrentAmount(scanner.nextFloat());

        return coffeeMaker;
    }

    public void fillCoffee(CoffeeMaker coffeeMaker) {
        float maxCapacity = coffeeMaker.getMaxCapacity();
        coffeeMaker.setCurrentAmount(maxCapacity);
        System.out.println("Cafetera llenada a su máxima capacidad!");
        System.out.println("Cafetera: " + maxCapacity + "L / " + maxCapacity + "L" );
    }

    public void serveCupCoffee(CoffeeMaker coffeeMaker, float cupCapacity) {
        float maxCapacity = coffeeMaker.getMaxCapacity();
        float currentAmount = coffeeMaker.getCurrentAmount();

        if(currentAmount < cupCapacity) {
            coffeeMaker.setCurrentAmount(0);
            System.out.println("Cantidad de café insuficiente!");
            System.out.println("No se llenó la taza :(");
            System.out.println("Taza: " + currentAmount + "L / " + cupCapacity + "L");
            System.out.println("Cafetera: 0L / " + maxCapacity + "L" );
            return;
        }
        coffeeMaker.setCurrentAmount(currentAmount - cupCapacity);
        System.out.println("Sirviendo café...");
        System.out.println("Se llenó la taza :)");
        System.out.println("Taza: " + cupCapacity + "L / " + cupCapacity + "L");
        System.out.println("Cafetera: " + coffeeMaker.getCurrentAmount() + "L / " + maxCapacity + "L" );
    }

    public void emptyCoffee(CoffeeMaker coffeeMaker) {
        float maxCapacity = coffeeMaker.getMaxCapacity();
        coffeeMaker.setCurrentAmount(0);
        System.out.println("Cafetera vacía!");
        System.out.println("Cafetera: 0L / " + maxCapacity + "L" );
    }

    public void addCoffee(CoffeeMaker coffeeMaker, float coffeeAmount) {
        float maxCapacity = coffeeMaker.getMaxCapacity();
        float currentAmount = coffeeMaker.getCurrentAmount();
        float availableCapacity = maxCapacity - currentAmount;

        if(availableCapacity < coffeeAmount) {
            coffeeMaker.setCurrentAmount(maxCapacity);
            System.out.println("Cantidad de café en exceso!");
            System.out.println("Se agregó " + availableCapacity + "L de café");
            System.out.println("Cafetera: " + maxCapacity + "L / " + maxCapacity + "L");
            return;
        }
        coffeeMaker.setCurrentAmount(currentAmount + coffeeAmount);
        System.out.println("Agregando café...");
        System.out.println("Se agregó " + coffeeAmount + "L de café");
        System.out.println("Cafetera: " + coffeeMaker.getCurrentAmount() + "L / " + maxCapacity + "L");
    }
}
