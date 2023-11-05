package org.amincia._07JPA.service;

import org.amincia._07JPA.entity.Author;

import java.util.List;

public interface AuthorService {
    List<Author> findAllAuthors();

    Author findAuthorById(String id);

    Author findAuthorByName(String name);

    void saveAuthor(Author author);

    void deleteAuthor(Author author);
}
