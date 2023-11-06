package org.amincia._01POO.Exercises.P112.entities;

import java.util.Calendar;

public class Person {
    private String name;
    private Calendar birthdate;

    public Person() {}

    public Person(String name, Calendar birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Calendar getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Calendar birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "PERSONA:" +
                "\nNombre: " + name +
                "\nFecha de nacimiento: " + birthdate.getTime();
    }
}
