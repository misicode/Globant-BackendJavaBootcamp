package _01POO.P205;

import _01POO.P205.entities.GuessMonth;
import _01POO.P205.services.GuessMonthService;

public class Main {
    public static void main(String[] args) {
        GuessMonthService guessMonthService = new GuessMonthService();
        GuessMonth guessMonth = guessMonthService.createGuessMonth();

        System.out.println("Adivine el mes secreto!");
        guessMonthService.guessSecretMonth(guessMonth);
    }
}
