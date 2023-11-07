package com.misicode._01POO.Exercises.P103;

import com.misicode._01POO.Exercises.P103.entities.Operation;
import com.misicode._01POO.Exercises.P103.services.OperationService;

public class Main {
    public static void main(String[] args) {
        OperationService operationService = new OperationService();
        Operation operation = operationService.createOperation();

        System.out.println(operation);
        System.out.println("Suma: " + operationService.calculateSum(operation));
        System.out.println("Resta: " + operationService.calculateRest(operation));
        System.out.println("Multiplicación: " + operationService.calculateMult(operation));
        System.out.println("División: " + operationService.calculateDiv(operation));
    }
}
