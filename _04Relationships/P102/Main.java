package org.amincia._04Relationships.P102;

import org.amincia._04Relationships.P102.entities.Game;
import org.amincia._04Relationships.P102.services.GameService;

public class Main {
    public static void main(String[] args) {
        GameService gameService = new GameService();
        Game game = gameService.startGame();
        gameService.round(game);
    }
}
