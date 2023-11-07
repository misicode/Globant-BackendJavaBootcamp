package com.misicode._01POO.Exercises.P205;

import com.misicode._01POO.Exercises.P205.entities.GuessMonth;
import com.misicode._01POO.Exercises.P205.services.GuessMonthService;

public class Main {
    public static void main(String[] args) {
        GuessMonthService guessMonthService = new GuessMonthService();
        GuessMonth guessMonth = guessMonthService.createGuessMonth();

        System.out.println("Adivine el mes secreto!");
        guessMonthService.guessSecretMonth(guessMonth);
    }
}
