package org.amincia._01POO.Exercises.P102;

import org.amincia._01POO.Exercises.P102.entities.Circumference;
import org.amincia._01POO.Exercises.P102.services.CircumferenceService;

public class Main {
    public static void main(String[] args) {
        CircumferenceService circumferenceService = new CircumferenceService();
        Circumference circumference = circumferenceService.createCircumference();

        System.out.println(circumference);
        System.out.println("Área: " + circumferenceService.calculateArea(circumference));
        System.out.println("Perímetro: " + circumferenceService.calculatePerimeter(circumference));
    }
}
