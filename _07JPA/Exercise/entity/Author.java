package com.misicode._07JPA.Exercise.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_author")
    private Integer idAuthor;

    @Column(length = 80, nullable = false)
    private String name;

    @Column(name = "is_active", columnDefinition = "boolean default true", nullable = false)
    private Boolean isActive = true;

    public Author() {}

    public Integer getIdAuthor() {
        return idAuthor;
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
        return "AUTOR = {" +
                "ID: " + idAuthor +
                ", Nombre: " + name +
                ", Activo: " + isActive + "}";
    }
}
