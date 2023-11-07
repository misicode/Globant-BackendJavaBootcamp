package com.misicode._01POO.Exercises.P206;

import com.misicode._01POO.Exercises.P206.entities.HangmanGame;
import com.misicode._01POO.Exercises.P206.services.HangmanGameService;

public class Main {
    public static void main(String[] args) {
        HangmanGameService hangmanGameService = new HangmanGameService();
        HangmanGame hangmanGame = hangmanGameService.createHangmanGame();

        hangmanGameService.playHangmanGame(hangmanGame);
    }
}
