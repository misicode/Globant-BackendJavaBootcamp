package com.misicode._07JPA.Exercise.repository;

import com.misicode._07JPA.Exercise.entity.Editorial;
import jakarta.persistence.EntityManager;

import java.util.List;

public class EditorialCRUDRepositoryImpl implements EditorialCRUDRepository {
    private final EntityManager em;

    public EditorialCRUDRepositoryImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<Editorial> findAll() {
        return em.createQuery("SELECT e FROM Editorial e", Editorial.class).getResultList();
    }

    @Override
    public Editorial findById(Object id) {
        return em.find(Editorial.class, id);
    }

    @Override
    public Editorial findByName(String name) {
        return em
                .createQuery("SELECT e FROM Editorial e WHERE e.name = :name AND e.isActive = true", Editorial.class)
                .setParameter("name", name.toUpperCase())
                .getResultList().stream().findFirst().orElse(null);
    }

    @Override
    public void save(Editorial editorial) {
        if(editorial.getIdEditorial() != null && editorial.getIdEditorial() > 0) {
            em.merge(editorial);
        } else {
            em.persist(editorial);
        }
    }

    @Override
    public void delete(Object id) {
        Editorial editorial = (Editorial) id;
        editorial.setActive(false);

        em.merge(editorial);
    }
}
