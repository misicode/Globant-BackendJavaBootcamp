package com.misicode._04Relationships.Exercises.P101.entities;

public class Person {
    private String name;
    private String lastname;
    private int age;
    private String idDoc;
    private Dog dog;

    public Person() {}

    public Person(String name, String lastname, int age, String idDoc, Dog dog) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.idDoc = idDoc;
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdDoc() {
        return idDoc;
    }

    public void setIdDoc(String idDoc) {
        this.idDoc = idDoc;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "\nPERSONA:" +
                "\nNombres: " + name +
                "\nApellidos: " + lastname +
                "\nEdad: " + age +
                "\nDocumento de identidad: " + idDoc +
                "\n" + dog;
    }
}
