package org.amincia._04Relationships.P103;

import org.amincia._04Relationships.P103.entities.DeckCards;
import org.amincia._04Relationships.P103.services.DeckCardsService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opt;

        DeckCardsService deckCardsService = new DeckCardsService();
        DeckCards deckCards = deckCardsService.createDeck();

        do {
            System.out.println("===================================");
            System.out.println("BARAJA DE CARTAS ESPAÑOLAS");
            System.out.println("1. Barajar");
            System.out.println("2. Ver siguiente carta");
            System.out.println("3. Contar cartas disponibles");
            System.out.println("4. Dar cartas");
            System.out.println("5. Ver cartas repartidas");
            System.out.println("6. Ver baraja de cartas");
            System.out.println("0. Salir");
            System.out.println("===================================");
            System.out.print("OPCIÓN: ");
            opt = scanner.nextInt();

            switch(opt) {
                case 1 -> {
                    System.out.println("BARAJAR");
                    deckCardsService.shuffleDeck(deckCards);
                }
                case 2 -> {
                    System.out.println("VER SIGUIENTE CARTA");
                    deckCardsService.nextCard(deckCards);
                }
                case 3 -> {
                    System.out.println("CONTAR CARTAS DISPONIBLES");
                    deckCardsService.countAvailableCards(deckCards);
                }
                case 4 -> {
                    System.out.println("DAR CARTAS");
                    System.out.print("Número de cartas a repartir: ");
                    deckCardsService.dealCards(deckCards, scanner.nextInt());
                }
                case 5 -> {
                    System.out.println("VER CARTAS REPARTIDAS");
                    deckCardsService.dealtDeck(deckCards);
                }
                case 6 -> {
                    System.out.println("VER BARAJA DE CARTAS");
                    System.out.println(deckCards);
                }
            }
        } while(opt != 0);
    }
}
