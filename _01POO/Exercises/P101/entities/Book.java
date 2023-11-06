package org.amincia._01POO.Exercises.P101.entities;

public class Book {
    private String isbn;
    private String title = "Watership Down";
    private String author = "Richard Adams";
    private int pagesNumber = 656;

    public Book() {}

    public Book(String isbn, String title, String author, int pagesNumber) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.pagesNumber = pagesNumber;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }

    @Override
    public String toString() {
        return "LIBRO:" +
                "\nISBN: " + isbn +
                "\nTítulo: " + title +
                "\nAutor: " + author +
                "\nPáginas: " + pagesNumber;
    }
}
