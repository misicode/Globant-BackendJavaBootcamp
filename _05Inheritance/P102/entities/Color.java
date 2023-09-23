package _05Inheritance.P102.entities;

public enum Color {
    B("BLANCO"),
    N("NEGRO"),
    R("ROJO"),
    A("AZUL"),
    G("GRIS");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}