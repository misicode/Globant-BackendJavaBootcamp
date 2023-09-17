package _04Relationships.P102.entities;

public class Player {
    private int id;
    private String name;
    private boolean isWet;

    public Player(int id) {
        this.id = id;
        this.name = "Jugador " + id;
        this.isWet = false;
    }

    public String getName() {
        return name;
    }

    public boolean getWet() {
        return isWet;
    }

    public void setWet(boolean wet) {
        isWet = wet;
    }
}
