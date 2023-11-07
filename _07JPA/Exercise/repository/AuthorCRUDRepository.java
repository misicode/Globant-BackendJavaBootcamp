package com.misicode._07JPA.Exercise.repository;

import com.misicode._07JPA.Exercise.entity.Author;

public interface AuthorCRUDRepository extends CRUDRepository<Author> {
    Author findByName(String name);
}
