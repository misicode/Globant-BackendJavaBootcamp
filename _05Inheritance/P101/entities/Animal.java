package _05Inheritance.P101.entities;

public class Animal {
    protected String name;
    protected String food;
    protected int age;
    protected String breed;

    public Animal(String name, String food, int age, String breed) {
        this.name = name;
        this.food = food;
        this.age = age;
        this.breed = breed;
    }

    public void feed() {
        System.out.println(this.name + " es un " + this.breed + " y se alimenta de " + this.food);
    }
}
