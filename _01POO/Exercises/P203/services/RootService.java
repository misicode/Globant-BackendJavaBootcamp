package com.misicode._01POO.Exercises.P203.services;

import com.misicode._01POO.Exercises.P203.entities.Root;

import java.util.Scanner;

public class RootService {
    Scanner scanner = new Scanner(System.in);

    public Root createRoot() {
        Root root = new Root();

        System.out.print("Ingrese el valor de a: ");
        root.setA(scanner.nextDouble());
        System.out.print("Ingrese el valor de b: ");
        root.setB(scanner.nextDouble());
        System.out.print("Ingrese el valor de c: ");
        root.setC(scanner.nextDouble());

        root.setDiscriminate(getDiscriminate(root));

        return root;
    }

    private double getDiscriminate(Root root) {
        return Math.pow(root.getB(), 2) - (4 * root.getA() * root.getC());
    }

    private boolean hasRoots(Root root) {
        return root.getDiscriminate() > 0;
    }

    private boolean hasRoot(Root root) {
        return root.getDiscriminate() == 0;
    }

    private double[] getRoots(Root root) {
        double root1 = - root.getB() + Math.sqrt(root.getDiscriminate()) / (2 * root.getA());
        double root2 = - root.getB() - Math.sqrt(root.getDiscriminate()) / (2 * root.getA());

        return new double[]{ root1, root2 };
    }

    private double getRoot(Root root) {
        return - root.getB() + Math.sqrt(root.getDiscriminate()) / (2 * root.getA());
    }

    public void calculateEquation(Root root) {
        if(hasRoots(root)) {
            System.out.println("Discriminante: " + root.getDiscriminate() + " > 0");
            System.out.println("La ecuación tiene dos soluciones (raíces)");
            System.out.println("Primera raíz: " + getRoots(root)[0]);
            System.out.println("Segunda raíz: " + getRoots(root)[1]);
        } else if(hasRoot(root)) {
            System.out.println("Discriminante: " + root.getDiscriminate() + " = 0");
            System.out.println("La ecuación tiene una sola solución (raíz)");
            System.out.println("Raíz: " + getRoot(root));
        } else {
            System.out.println("Discriminante: " + root.getDiscriminate() + " < 0");
            System.out.println("La ecuación no tiene solución");
        }
    }
}
