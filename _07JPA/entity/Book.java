package org.amincia._07JPA.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class Book {
    @Id
    @Column(name = "isbn", length = 13)
    private String isbn;

    @Column(nullable = false, length = 150)
    private String title;

    @Column(nullable = false)
    private Integer year;

    @Column(nullable = false)
    private Integer exemplars;

    @Column(name = "borrowed_exemplars", nullable = false)
    private Integer borrowedExemplars;

    @Column(name = "remaining_exemplars", nullable = false)
    private Integer remainingExemplars;

    @Column(name = "is_active", columnDefinition = "boolean default true", nullable = false)
    private Boolean isActive = true;

    @OneToOne
    private Author author;

    @OneToOne
    private Editorial editorial;

    public Book() {}

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title.toUpperCase();
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getExemplars() {
        return exemplars;
    }

    public void setExemplars(Integer exemplars) {
        this.exemplars = exemplars;
    }

    public Integer getBorrowedExemplars() {
        return borrowedExemplars;
    }

    public void setBorrowedExemplars(Integer borrowedExemplars) {
        this.borrowedExemplars = borrowedExemplars;
    }

    public Integer getRemainingExemplars() {
        return remainingExemplars;
    }

    public void setRemainingExemplars(Integer remainingExemplars) {
        this.remainingExemplars = remainingExemplars;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "LIBRO = {" +
                "ISBN: " + isbn +
                ", Título: " + title +
                ", Año: " + year +
                ", Ejemplares: " + exemplars +
                ", Ejemplares prestados: " + borrowedExemplars +
                ", Ejemplares restantes: " + remainingExemplars +
                ", Activo: " + isActive +
                ", Autor: " + author.getName() +
                ", Editorial: " + editorial.getName() + "}";
    }
}
