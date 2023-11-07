package com.misicode._01POO.Exercises.P113.entities;

public enum Turn {
    M("Mañana"),
    T("Tarde");

    private final String turn;

    Turn(String turn) {
        this.turn = turn;
    }

    public String getTurn() {
        return turn;
    }
}
