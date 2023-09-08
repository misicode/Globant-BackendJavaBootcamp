package POO.P102.services;

import POO.P102.entities.Circumference;

import java.util.Scanner;

public class CircumferenceService {
    Scanner scanner = new Scanner(System.in);

    public Circumference createCircumference() {
        Circumference circumference = new Circumference();

        System.out.print("Ingrese el radio: ");
        circumference.setRadio(scanner.nextDouble());

        return circumference;
    }

    public double calculateArea(Circumference circumference) {
        return Math.PI * Math.pow(circumference.getRadio(), 2);
    }

    public double calculatePerimeter(Circumference circumference) {
        return 2 * Math.PI * circumference.getRadio();
    }
}
