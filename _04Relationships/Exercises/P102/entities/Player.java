package com.misicode._04Relationships.Exercises.P102.entities;

public class Player {
    private int id;
    private String name;
    private boolean isWet;

    public Player(int id) {
        this.id = id;
        this.name = "Jugador " + id;
        this.isWet = false;
    }

    public String getName() {
        return name;
    }

    public void setWet(boolean wet) {
        isWet = wet;
    }
}
