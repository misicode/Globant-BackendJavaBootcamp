package com.misicode._07JPA.Exercise.repository;

import com.misicode._07JPA.Exercise.entity.Book;

import java.util.List;

public interface BookCRUDRepository extends CRUDRepository<Book> {
    Book findByTitle(String title);

    List<Book> findByAuthorName(String name);

    List<Book> findByEditorialName(String name);
}
