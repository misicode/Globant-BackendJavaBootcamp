package org.amincia._07JPA.repository;

import org.amincia._07JPA.entity.Editorial;

public interface EditorialCRUDRepository extends CRUDRepository<Editorial> {
    Editorial findByName(String name);
}
