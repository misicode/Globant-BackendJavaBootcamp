package org.amincia._07JPA.Exercise.repository;

import org.amincia._07JPA.Exercise.entity.Editorial;

public interface EditorialCRUDRepository extends CRUDRepository<Editorial> {
    Editorial findByName(String name);
}
