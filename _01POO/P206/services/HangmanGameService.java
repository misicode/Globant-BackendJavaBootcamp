package org.amincia._01POO.P206.services;

import org.amincia._01POO.P206.entities.HangmanGame;

import java.util.Scanner;

public class HangmanGameService {
    Scanner scanner = new Scanner(System.in);

    public HangmanGame createHangmanGame() {
        HangmanGame hangmanGame = new HangmanGame();

        System.out.print("Ingrese la palabra a buscar: ");
        String word = scanner.next();
        hangmanGame.setWord(word);
        hangmanGame.setWordLength(word.length());
        hangmanGame.setWordToSearch(word.toCharArray());
        System.out.print("Ingrese el número de jugadas máxima: ");
        hangmanGame.setNumAttemps(scanner.nextInt());
        hangmanGame.setNumLettersFound(0);

        return hangmanGame;
    }

    private boolean searchLetter(HangmanGame hangmanGame, String letter) {
        boolean isLetterFound = false;

        for(int i = 0; i < hangmanGame.getWordLength(); i++) {
            if(letter.equals(String.valueOf(hangmanGame.getWord().charAt(i)))) {
                isLetterFound = true;
                hangmanGame.setWord(hangmanGame.getWord().replaceAll(letter, "0"));
                hangmanGame.setNumLettersFound(hangmanGame.getNumLettersFound() + 1);
            }
        }

        return isLetterFound;
    }

    private void lettersFound(HangmanGame hangmanGame, String letter) {
        System.out.println("Longitud de la palabra: " + hangmanGame.getWordLength());

        if(searchLetter(hangmanGame, letter)) {
            System.out.println("Mensaje: La letra pertenece a la palabra");
        } else {
            hangmanGame.setNumAttemps(hangmanGame.getNumAttemps() - 1);
            System.out.println("Mensaje: La letra no pertenece a la palabra o ya fue encontrada");
        }

        System.out.println("Número de letras (encontradas, faltantes): " +
                hangmanGame.getNumLettersFound() + ", " +
                (hangmanGame.getWordLength() - hangmanGame.getNumLettersFound()));
        System.out.println("Número de intentos restantes: " + hangmanGame.getNumAttemps());
    }

    public void playHangmanGame(HangmanGame hangmanGame) {
        boolean isWordFound;

        do {
            System.out.print("Ingrese una letra: ");
            lettersFound(hangmanGame, scanner.next());
            isWordFound = (hangmanGame.getNumLettersFound() == hangmanGame.getWordLength());
        } while(!isWordFound && hangmanGame.getNumAttemps() > 0);

        if(isWordFound) {
            System.out.println("Felicidades! Encontraste la palabra :)");
            System.out.println("Palabra: " + String.valueOf(hangmanGame.getWordToSearch()));
        } else {
            System.out.println("Lo sentimos, te quedaste sin intentos :(");
            System.out.println("La palabra era: " + String.valueOf(hangmanGame.getWordToSearch()));
        }

        hangmanGame.setNumAttemps(hangmanGame.getNumAttemps() - 1);
    }
}
