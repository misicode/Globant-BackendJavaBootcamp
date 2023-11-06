package org.amincia._04Relationships.Exercises.P103.entities;

import java.util.ArrayList;

public class DeckCards {
    private ArrayList<Card> deck;
    private final ArrayList<Card> dealtDeck;

    public DeckCards() {
        this.dealtDeck = new ArrayList<>();
    }

    public DeckCards(ArrayList<Card> deck) {
        this();
        this.deck = deck;
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public ArrayList<Card> getDealtDeck() {
        return dealtDeck;
    }

    public void setDealtDeck(Card card) {
        this.dealtDeck.add(card);
    }

    @Override
    public String toString() {
        return "BARAJA:\n" + deck;
    }
}
