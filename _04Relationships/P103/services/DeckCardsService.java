package _04Relationships.P103.services;

import _04Relationships.P103.entities.Card;
import _04Relationships.P103.entities.DeckCards;
import _04Relationships.P103.entities.Symbol;

import java.util.ArrayList;
import java.util.Collections;

public class DeckCardsService {
    public DeckCards createDeck() {
        ArrayList<Card> cards = new ArrayList<>();

        for(int i = 1; i < 13; i++) {
            if(i == 8 || i == 9) {
                continue;
            }
            cards.add(new Card(i, Symbol.E));
            cards.add(new Card(i, Symbol.B));
            cards.add(new Card(i, Symbol.O));
            cards.add(new Card(i, Symbol.C));
        }

        return new DeckCards(cards);
    }

    public void shuffleDeck(DeckCards deckCards) {
        Collections.shuffle(deckCards.getDeck());
        System.out.println("Las cartas fueron barajadas");
    }

    public void nextCard(DeckCards deckCards) {
        if(deckCards.getDeck().isEmpty()) {
            System.out.println("Baraja de cartas vacía");
        } else {
            Card card = deckCards.getDeck().remove(0);
            deckCards.setDealtDeck(card);
            System.out.println("La siguiente carta es: " + card);
        }
    }

    public void countAvailableCards(DeckCards deckCards) {
        System.out.println("Quedan " + deckCards.getDeck().size() + " cartas disponibles");
    }

    public void dealCards(DeckCards deckCards, int cantDeal) {
        if(cantDeal > deckCards.getDeck().size()) {
            System.out.println("Quedan menos cartas de las solicitadas, vuelva a intentar");
        } else {
            for (int i = 0; i < cantDeal; i++) nextCard(deckCards);
        }
    }

    public void dealtDeck(DeckCards deckCards) {
        if(deckCards.getDealtDeck().isEmpty()) {
            System.out.println("Aún no se han repartido cartas");
        } else {
            System.out.println(deckCards.getDealtDeck());
        }
    }
}
