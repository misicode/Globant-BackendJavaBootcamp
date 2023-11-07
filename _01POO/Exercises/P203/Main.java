package com.misicode._01POO.Exercises.P203;

import com.misicode._01POO.Exercises.P203.entities.Root;
import com.misicode._01POO.Exercises.P203.services.RootService;

public class Main {
    public static void main(String[] args) {
        RootService rootService = new RootService();
        Root root = rootService.createRoot();

        rootService.calculateEquation(root);
    }
}
