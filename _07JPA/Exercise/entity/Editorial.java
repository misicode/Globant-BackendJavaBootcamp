package com.misicode._07JPA.Exercise.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "editorial")
public class Editorial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_editorial")
    private Integer idEditorial;

    @Column(length = 80, nullable = false)
    private String name;

    @Column(name = "is_active", columnDefinition = "boolean default true", nullable = false)
    private Boolean isActive = true;

    public Editorial() {}

    public Integer getIdEditorial() {
        return idEditorial;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.toUpperCase();
    }


    public void setActive(Boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "EDITORIAL = {" +
                "ID: " + idEditorial +
                ", Nombre: " + name +
                ", Activo: " + isActive + "}";
    }
}
