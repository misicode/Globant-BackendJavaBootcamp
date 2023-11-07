package com.misicode._07JPA.Exercise.repository;

import com.misicode._07JPA.Exercise.entity.Editorial;

public interface EditorialCRUDRepository extends CRUDRepository<Editorial> {
    Editorial findByName(String name);
}
