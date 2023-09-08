package POO.P206;

import POO.P206.entities.HangmanGame;
import POO.P206.services.HangmanGameService;

public class Main {
    public static void main(String[] args) {
        HangmanGameService hangmanGameService = new HangmanGameService();
        HangmanGame hangmanGame = hangmanGameService.createHangmanGame();

        hangmanGameService.playHangmanGame(hangmanGame);
    }
}
