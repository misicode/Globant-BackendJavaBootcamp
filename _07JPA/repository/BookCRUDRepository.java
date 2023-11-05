package org.amincia._07JPA.repository;

import org.amincia._07JPA.entity.Book;

import java.util.List;

public interface BookCRUDRepository extends CRUDRepository<Book> {
    Book findByTitle(String title);

    List<Book> findByAuthorName(String name);

    List<Book> findByEditorialName(String name);
}
