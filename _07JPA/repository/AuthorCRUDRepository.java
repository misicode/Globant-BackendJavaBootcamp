package org.amincia._07JPA.repository;

import org.amincia._07JPA.entity.Author;

public interface AuthorCRUDRepository extends CRUDRepository<Author> {
    Author findByName(String name);
}
