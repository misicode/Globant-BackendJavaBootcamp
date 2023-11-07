package com.misicode._04Relationships.Exercises.P103.entities;

public class Card {
    private int number;
    private Symbol symbol;

    public Card() {}

    public Card(int number, Symbol symbol) {
        this.number = number;
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "[" + number + ", " + symbol.getSymbol() + "]";
    }
}
