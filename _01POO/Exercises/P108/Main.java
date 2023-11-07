package com.misicode._01POO.Exercises.P108;

import com.misicode._01POO.Exercises.P108.entities.Chain;
import com.misicode._01POO.Exercises.P108.services.ChainService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ChainService chainService = new ChainService();
        Chain chain = chainService.createChain();
        Scanner scanner = new Scanner(System.in).useDelimiter("\r?\n");
        int opt;

        do {
            System.out.println("===================================");
            System.out.println("OPERACIONES DE CADENAS");
            System.out.println("1. Mostrar vocales");
            System.out.println("2. Invertir frase");
            System.out.println("3. Contar carácter repetido");
            System.out.println("4. Comparar longitud");
            System.out.println("5. Unir frases");
            System.out.println("6. Reemplazar carácter");
            System.out.println("7. Contiene carácter");
            System.out.println("0. Salir");
            System.out.println("===================================");
            System.out.print("OPCIÓN: ");
            opt = scanner.nextInt();

            switch(opt) {
                case 1 -> {
                    System.out.println("MOSTRAR VOCALES");
                    chainService.showVowels(chain);
                }
                case 2 -> {
                    System.out.println("INVERTIR FRASE");
                    chainService.reversePhrase(chain);
                }
                case 3 -> {
                    System.out.println("CONTAR CARÁCTER REPETIDO");
                    System.out.print("Carácter: ");
                    chainService.countCharacter(chain, scanner.next().charAt(0));
                }
                case 4 -> {
                    System.out.println("COMPARAR LONGITUD");
                    System.out.print("Frase a comparar: ");
                    chainService.compareLongitude(chain, scanner.next());
                }
                case 5 -> {
                    System.out.println("UNIR FRASES");
                    System.out.print("Frase a unir: ");
                    chainService.joinPhrases(chain, scanner.next());
                }
                case 6 -> {
                    System.out.println("REEMPLAZAR CARÁCTER");
                    System.out.print("Carácter: ");
                    chainService.replaceCharacter(chain, scanner.next().charAt(0));
                }
                case 7 -> {
                    System.out.println("CONTIENE CARÁCTER");
                    System.out.print("Carácter: ");
                    chainService.containsCharacter(chain, scanner.next().charAt(0));
                }
            }
        } while(opt != 0);
    }
}
