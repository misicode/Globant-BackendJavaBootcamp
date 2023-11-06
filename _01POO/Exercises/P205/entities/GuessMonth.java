package org.amincia._01POO.Exercises.P205.entities;

public class GuessMonth {
    private String secretMonth;
    public static final String[] MONTHS = {
            "enero", "febrero", "marzo", "abril", "mayo", "junio",
            "julio", "agosto", "setiembre", "octubre", "noviembre", "diciembre",
    };

    public GuessMonth() {}

    public GuessMonth(String secretMonth) {
        this.secretMonth = secretMonth;
    }

    public String getSecretMonth() {
        return secretMonth;
    }

    public void setSecretMonth(String secretMonth) {
        this.secretMonth = secretMonth;
    }
}
