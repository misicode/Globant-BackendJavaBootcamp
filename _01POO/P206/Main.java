package _01POO.P206;

import _01POO.P206.entities.HangmanGame;
import _01POO.P206.services.HangmanGameService;

public class Main {
    public static void main(String[] args) {
        HangmanGameService hangmanGameService = new HangmanGameService();
        HangmanGame hangmanGame = hangmanGameService.createHangmanGame();

        hangmanGameService.playHangmanGame(hangmanGame);
    }
}
