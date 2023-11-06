package org.amincia._04Relationships.Exercises.P102;

import org.amincia._04Relationships.Exercises.P102.services.GameService;
import org.amincia._04Relationships.Exercises.P102.entities.Game;

public class Main {
    public static void main(String[] args) {
        GameService gameService = new GameService();
        Game game = gameService.startGame();
        gameService.round(game);
    }
}
