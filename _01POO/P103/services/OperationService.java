package org.amincia._01POO.P103.services;

import org.amincia._01POO.P103.entities.Operation;

import java.util.Scanner;

public class OperationService {
    Scanner scanner = new Scanner(System.in);

    public Operation createOperation() {
        Operation operation = new Operation();

        scanner.useDelimiter("\r?\n");
        System.out.print("Ingrese el número 1: ");
        operation.setNumber1(scanner.nextDouble());
        System.out.print("Ingrese el número 2: ");
        operation.setNumber2(scanner.nextDouble());

        return operation;
    }

    public Double calculateSum(Operation operation) {
        return operation.getNumber1() + operation.getNumber2();
    }

    public Double calculateRest(Operation operation) {
        return operation.getNumber1() - operation.getNumber2();
    }

    public Double calculateMult(Operation operation) {
        if(operation.getNumber1() == 0 || operation.getNumber2() == 0) {
            System.out.println("Multiplicación por 0 no permitida!");
            return 0.0;
        }
        return operation.getNumber1() * operation.getNumber2();
    }

    public Double calculateDiv(Operation operation) {
        if(operation.getNumber1() == 0 || operation.getNumber2() == 0) {
            System.out.println("División por 0 no permitida!");
            return 0.0;
        }
        return operation.getNumber1() / operation.getNumber2();
    }
}
