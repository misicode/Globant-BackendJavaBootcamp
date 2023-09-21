package _04Relationships.P201.entities;

public class Dog {
    private String name;
    private boolean adopted;

    public Dog() {
        this.adopted = false;
    }

    public Dog(String name) {
        this();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAdopted() {
        return adopted;
    }

    public void setAdopted(boolean adopted) {
        this.adopted = adopted;
    }

    @Override
    public String toString() {
        return "Perro: " + name;
    }
}
