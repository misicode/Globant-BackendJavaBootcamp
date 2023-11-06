package org.amincia._04Relationships.Exercises.P102.entities;

import java.util.ArrayList;

public class Game {
    private int numPlayers;
    private ArrayList<Player> players;
    private WaterRevolver waterRevolver;

    public Game() {}

    public Game(ArrayList<Player> players, WaterRevolver waterRevolver) {
        this.players = players;
        this.waterRevolver = waterRevolver;
        this.numPlayers = players.size();
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public WaterRevolver getWaterRevolver() {
        return waterRevolver;
    }

    public void setWaterRevolver(WaterRevolver waterRevolver) {
        this.waterRevolver = waterRevolver;
    }

    public int getNumPlayers() {
        return numPlayers;
    }

    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }
}
