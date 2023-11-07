package com.misicode._07JPA.Exercise.service;

import com.misicode._07JPA.Exercise.entity.Author;

import java.util.List;

public interface AuthorService {
    List<Author> findAllAuthors();

    Author findAuthorById(String id);

    Author findAuthorByName(String name);

    void saveAuthor(Author author);

    void deleteAuthor(Author author);
}
