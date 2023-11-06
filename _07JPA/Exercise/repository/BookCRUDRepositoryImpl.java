package org.amincia._07JPA.Exercise.repository;

import jakarta.persistence.EntityManager;
import org.amincia._07JPA.Exercise.entity.Book;

import java.util.List;

public class BookCRUDRepositoryImpl implements BookCRUDRepository {
    private final EntityManager em;

    public BookCRUDRepositoryImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public Book findByTitle(String title) {
        return em
                .createQuery("SELECT b FROM Book b WHERE b.title = :title AND b.isActive = true", Book.class)
                .setParameter("title", title.toUpperCase())
                .getResultList().stream().findFirst().orElse(null);
    }

    @Override
    public List<Book> findByAuthorName(String name) {
        return em
                .createQuery("SELECT b FROM Book b WHERE b.author.name = :name AND b.isActive = true", Book.class)
                .setParameter("name", name).getResultList();
    }

    @Override
    public List<Book> findByEditorialName(String name) {
        return em
                .createQuery("SELECT b FROM Book b WHERE b.editorial.name = :name AND b.isActive = true", Book.class)
                .setParameter("name", name).getResultList();
    }

    @Override
    public List<Book> findAll() {
        return em.createQuery("SELECT b FROM Book b", Book.class).getResultList();
    }

    @Override
    public Book findById(Object id) {
        return em.find(Book.class, id);
    }

    @Override
    public void save(Book book) {
        if(book.getIsbn() != null) {
            em.merge(book);
        } else {
            em.persist(book);
        }
    }

    @Override
    public void delete(Object id) {
        Book book = (Book) id;
        book.setActive(false);

        em.merge(book);
    }
}
