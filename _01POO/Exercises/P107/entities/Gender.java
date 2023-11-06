package org.amincia._01POO.Exercises.P107.entities;

public enum Gender {
    H("Hombre"),
    M("Mujer"),
    O("Otro");

    private final String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}
