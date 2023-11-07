package com.misicode._01POO.Exercises.P206.entities;

public class HangmanGame {
    private char[] wordToSearch;
    private int numLettersFound;
    private int numAttemps;
    private int wordLength;
    private String word;

    public HangmanGame() {}

    public HangmanGame(int numLettersFound, int numAttemps, String word) {
        this.numLettersFound = numLettersFound;
        this.numAttemps = numAttemps;
        this.word = word;
    }

    public char[] getWordToSearch() {
        return wordToSearch;
    }

    public void setWordToSearch(char[] wordToSearch) {
        this.wordToSearch = wordToSearch;
    }

    public int getNumLettersFound() {
        return numLettersFound;
    }

    public void setNumLettersFound(int numLettersFound) {
        this.numLettersFound = numLettersFound;
    }

    public int getNumAttemps() {
        return numAttemps;
    }

    public void setNumAttemps(int numAttemps) {
        this.numAttemps = numAttemps;
    }

    public int getWordLength() {
        return wordLength;
    }

    public void setWordLength(int wordLength) {
        this.wordLength = wordLength;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
