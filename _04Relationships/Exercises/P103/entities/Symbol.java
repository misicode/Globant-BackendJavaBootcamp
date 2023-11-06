package org.amincia._04Relationships.Exercises.P103.entities;

public enum Symbol {
    E("Espadas"),
    B("Bastos"),
    O("Oros"),
    C("Copas");

    private final String symbol;

    Symbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
