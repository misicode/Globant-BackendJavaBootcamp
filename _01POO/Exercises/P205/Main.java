package org.amincia._01POO.Exercises.P205;

import org.amincia._01POO.Exercises.P205.entities.GuessMonth;
import org.amincia._01POO.Exercises.P205.services.GuessMonthService;

public class Main {
    public static void main(String[] args) {
        GuessMonthService guessMonthService = new GuessMonthService();
        GuessMonth guessMonth = guessMonthService.createGuessMonth();

        System.out.println("Adivine el mes secreto!");
        guessMonthService.guessSecretMonth(guessMonth);
    }
}
