package org.amincia._07JPA.service;

import org.amincia._07JPA.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> findAllBooks();

    Book findBookById(String isbn);

    Book findBookByTitle(String title);

    List<Book> findBooksByAuthorName(String name);

    List<Book> findBooksByEditorialName(String name);

    void saveBook(Book book);

    void deleteBook(Book book);
}
