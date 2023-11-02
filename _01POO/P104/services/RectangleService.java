package org.amincia._01POO.P104.services;

import org.amincia._01POO.P104.entities.Rectangle;

import java.util.Scanner;

public class RectangleService {
    Scanner scanner = new Scanner(System.in);

    public Rectangle createRectangle() {
        Rectangle rectangle = new Rectangle();

        System.out.print("Ingrese la base: ");
        rectangle.setBase(scanner.nextInt());
        System.out.print("Ingrese la altura: ");
        rectangle.setHeight(scanner.nextInt());

        return rectangle;
    }

    public int calculateArea(Rectangle rectangle) {
        return rectangle.getBase() * rectangle.getHeight();
    }

    public int calculatePerimeter(Rectangle rectangle) {
        return (rectangle.getBase() + rectangle.getHeight()) * 2;
    }

    public String drawRectangle(Rectangle rectangle) {
        return ("*".repeat(rectangle.getBase()) + "\n").repeat(rectangle.getHeight());
    }
}
