package POO.P205;

import POO.P205.entities.GuessMonth;
import POO.P205.services.GuessMonthService;

public class Main {
    public static void main(String[] args) {
        GuessMonthService guessMonthService = new GuessMonthService();
        GuessMonth guessMonth = guessMonthService.createGuessMonth();

        System.out.println("Adivine el mes secreto!");
        guessMonthService.guessSecretMonth(guessMonth);
    }
}
