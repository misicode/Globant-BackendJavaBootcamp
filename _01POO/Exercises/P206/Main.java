package org.amincia._01POO.Exercises.P206;

import org.amincia._01POO.Exercises.P206.entities.HangmanGame;
import org.amincia._01POO.Exercises.P206.services.HangmanGameService;

public class Main {
    public static void main(String[] args) {
        HangmanGameService hangmanGameService = new HangmanGameService();
        HangmanGame hangmanGame = hangmanGameService.createHangmanGame();

        hangmanGameService.playHangmanGame(hangmanGame);
    }
}
