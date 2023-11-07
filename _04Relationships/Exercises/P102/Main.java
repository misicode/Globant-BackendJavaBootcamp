package com.misicode._04Relationships.Exercises.P102;

import com.misicode._04Relationships.Exercises.P102.entities.Game;
import com.misicode._04Relationships.Exercises.P102.services.GameService;

public class Main {
    public static void main(String[] args) {
        GameService gameService = new GameService();
        Game game = gameService.startGame();
        gameService.round(game);
    }
}
