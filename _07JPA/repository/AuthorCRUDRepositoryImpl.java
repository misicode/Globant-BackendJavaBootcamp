package org.amincia._07JPA.repository;

import jakarta.persistence.EntityManager;
import org.amincia._07JPA.entity.Author;

import java.util.List;

public class AuthorCRUDRepositoryImpl implements AuthorCRUDRepository {
    private final EntityManager em;

    public AuthorCRUDRepositoryImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<Author> findAll() {
        return em.createQuery("SELECT a FROM Author a", Author.class).getResultList();
    }

    @Override
    public Author findById(Object id) {
        return em.find(Author.class, id);
    }

    @Override
    public Author findByName(String name) {
        return em
                .createQuery("SELECT a FROM Author a WHERE a.name = :name AND a.isActive = true", Author.class)
                .setParameter("name", name.toUpperCase())
                .getResultList().stream().findFirst().orElse(null);
    }

    @Override
    public void save(Author author) {
        if(author.getIdAuthor() != null && author.getIdAuthor() > 0) {
            em.merge(author);
        } else {
            em.persist(author);
        }
    }

    @Override
    public void delete(Object id) {
        Author author = (Author) id;
        author.setActive(false);

        em.merge(author);
    }
}
