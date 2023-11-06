package org.amincia._01POO.Exercises.P204;

import org.amincia._01POO.Exercises.P204.entities.Document;
import org.amincia._01POO.Exercises.P204.services.DocumentService;

public class Main {
    public static void main(String[] args) {
        DocumentService documentService = new DocumentService();
        Document document = documentService.createDocument();

        System.out.println(document);
    }
}
