package org.amincia._01POO.P203;

import org.amincia._01POO.P203.entities.Root;
import org.amincia._01POO.P203.services.RootService;

public class Main {
    public static void main(String[] args) {
        RootService rootService = new RootService();
        Root root = rootService.createRoot();

        rootService.calculateEquation(root);
    }
}
