package org.amincia._07JPA.Exercise.service;

import org.amincia._07JPA.Exercise.entity.Editorial;

import java.util.List;

public interface EditorialService {
    List<Editorial> findAllEditorials();

    Editorial findEditorialById(String id);

    Editorial findEditorialByName(String name);

    void saveEditorial(Editorial editorial);

    void deleteEditorial(Editorial editorial);
}
