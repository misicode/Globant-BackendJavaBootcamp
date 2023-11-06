package org.amincia._01POO.Exercises.P204.services;

import org.amincia._01POO.Exercises.P204.entities.Document;

import java.util.Scanner;

public class DocumentService {
    Scanner scanner = new Scanner(System.in);
    private static final char[] NIF_CODS = {
            'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F',
            'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S',
            'Q', 'V', 'H', 'L', 'C', 'K', 'E',
    };

    public Document createDocument() {
        Document document = new Document();
        String dni;

        do {
            System.out.print("Ingrese el DNI (8 dígitos): ");
            dni = scanner.nextLine();
        } while(dni.length() != 8);

        document.setDni(dni);
        document.setNif(calculateNif(dni));

        return document;
    }

    private char calculateNif(String dni) {
        return NIF_CODS[Integer.parseInt(dni) % 23];
    }
}
