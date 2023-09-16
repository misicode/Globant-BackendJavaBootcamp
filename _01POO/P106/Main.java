package _01POO.P106;

import _01POO.P106.entities.CoffeeMaker;
import _01POO.P106.services.CoffeeMakerService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CoffeeMakerService coffeeMakerService = new CoffeeMakerService();
        CoffeeMaker coffeeMaker = coffeeMakerService.createCoffeMaker();
        Scanner scanner = new Scanner(System.in);
        int opt;

        do {
            System.out.println("===================================");
            System.out.println("OPERACIONES DE CAFETERA");
            System.out.println("1. Llenar cafetera");
            System.out.println("2. Servir taza");
            System.out.println("3. Vaciar cafetera");
            System.out.println("4. Agregar café");
            System.out.println("0. Salir");
            System.out.println("===================================");
            System.out.print("OPCIÓN: ");
            opt = scanner.nextInt();

            switch(opt) {
                case 1 -> {
                    System.out.println("LLENAR CAFETERA");
                    coffeeMakerService.fillCoffee(coffeeMaker);
                }
                case 2 -> {
                    System.out.println("SERVIR TAZA");
                    System.out.print("Capacidad de la taza: ");
                    coffeeMakerService.serveCupCoffee(coffeeMaker, scanner.nextFloat());
                }
                case 3 -> {
                    System.out.println("VACIAR CAFETERA");
                    coffeeMakerService.emptyCoffee(coffeeMaker);
                }
                case 4 -> {
                    System.out.println("AGREGAR CAFÉ");
                    System.out.print("Cantidad de café: ");
                    coffeeMakerService.addCoffee(coffeeMaker, scanner.nextFloat());
                }
            }
        } while(opt != 0);
    }
}
