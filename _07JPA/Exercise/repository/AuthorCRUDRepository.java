package org.amincia._07JPA.Exercise.repository;

import org.amincia._07JPA.Exercise.entity.Author;

public interface AuthorCRUDRepository extends CRUDRepository<Author> {
    Author findByName(String name);
}
