package org.amincia._01POO.P108.entities;

public class Chain {
    private String phrase;
    private int longitude;

    public Chain() {}

    public Chain(String phrase) {
        this.phrase = phrase;
        this.longitude = phrase.length();
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
        this.longitude = phrase.length();
    }

    public int getLongitude() {
        return longitude;
    }


}