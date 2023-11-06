package org.amincia._01POO.Exercises.P109.services;

import org.amincia._01POO.Exercises.P109.entities.Mathematics;

public class MathematicsService {
    public Mathematics createMathematics() {
        double num1 = Math.random() * (99 + 1);
        double num2 = Math.random() * (99 + 1);

        Mathematics mathematics = new Mathematics();
        mathematics.setNumber1(num1);
        mathematics.setNumber2(num2);
        mathematics.setNumMax(num1, num2);
        mathematics.setNumMin(num1, num2);

        return mathematics;
    }

    public void returnMayor(Mathematics mathematics) {
        System.out.println("El número mayor es: " + mathematics.getNumMax());
    }

    public void calculatePow(Mathematics mathematics) {
        int numMax = (int) Math.round(mathematics.getNumMax());
        int numMin = (int) Math.round(mathematics.getNumMin());
        double pow = Math.pow(numMax, numMin);

        System.out.println("La potencia de " + numMax + "^" + numMin + " es: " + pow );
    }

    public void calculateSquareRoot(Mathematics mathematics) {
        int numMin = (int) Math.abs(Math.round(mathematics.getNumMin()));
        double squareRoot = Math.sqrt(numMin);

        System.out.println("La raíz cuadrada de " + numMin + " es: " + squareRoot );
    }
}
