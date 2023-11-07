package com.misicode._01POO.Exercises.P205.services;

import com.misicode._01POO.Exercises.P205.entities.GuessMonth;

import java.util.Scanner;

public class GuessMonthService {
    Scanner scanner = new Scanner(System.in);

    public GuessMonth createGuessMonth() {
        GuessMonth guessMonth = new GuessMonth();
        guessMonth.setSecretMonth(assignSecretMonth());

        return guessMonth;
    }

    private String assignSecretMonth() {
        int index = (int) Math.round(Math.random() * 12);
        return GuessMonth.MONTHS[index];
    }

    public void guessSecretMonth(GuessMonth guessMonth) {
        boolean isSecretMonth;
        String month;

        do {
            System.out.print("Ingrese el nombre del mes en minúsculas: ");
            month = scanner.next().toLowerCase();
            isSecretMonth = month.equals(guessMonth.getSecretMonth());

            if(!isSecretMonth) System.out.println("No ha acertado :( Intente introduciendo otro mes");
        } while(!isSecretMonth);

        System.out.println("Felicidades! Ha acertado! :)");
        System.out.println("El mes secreto era: " + guessMonth.getSecretMonth());
    }
}
