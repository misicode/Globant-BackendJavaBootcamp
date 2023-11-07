package com.misicode._07JPA.Exercise.service;

import com.misicode._07JPA.Exercise.entity.Author;
import com.misicode._07JPA.Exercise.repository.AuthorCRUDRepositoryImpl;
import jakarta.persistence.EntityManager;
import com.misicode._07JPA.Exercise.repository.AuthorCRUDRepository;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class AuthorServiceImpl implements AuthorService {
    private final EntityManager em;
    private final AuthorCRUDRepository authorRepository;
    private final Scanner scanner = new Scanner(System.in).useDelimiter("\r?\n");

    public AuthorServiceImpl(EntityManager em) {
        this.em = em;
        this.authorRepository = new AuthorCRUDRepositoryImpl(em);
    }

    public Author createAuthor() {
        Author author = new Author();

        author.setName(checkAuthorName());

        return author;
    }

    public Author updateAuthor() {
        Author author = checkAuthorByID();

        System.out.println(author);

        author.setName(checkAuthorName());

        return author;
    }

    private String checkAuthorName() {
        do {
            System.out.print("Ingrese el nombre del autor: ");
            String name = scanner.nextLine().trim();

            if(name.isEmpty() || Optional.ofNullable(authorRepository.findByName(name)).isPresent()) {
                System.out.println("Nombre de autor inválido o ya registrado!");
            } else {
                return name;
            }
        } while(true);
    }

    public Author checkAuthorByID() {
        Author author;

        do {
            System.out.print("Ingrese el ID del autor: ");
            author = findAuthorById(scanner.nextLine().trim());
        } while(author == null);

        return author;
    }

    public Author checkAuthorByName() {
        Author author;

        do {
            System.out.print("Ingrese el nombre del autor: ");
            author = findAuthorByName(scanner.nextLine().trim());
        } while(author == null);

        return author;
    }

    @Override
    public List<Author> findAllAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public Author findAuthorById(String id) {
        try {
            Optional<Author> author = Optional.ofNullable(authorRepository.findById(Integer.parseInt(id)));
            if(author.isEmpty()) {
                System.out.println("Autor no encontrado!");
                return null;
            } else {
                return author.get();
            }
        } catch(Exception e) {
            System.out.println("ID inválido!");
            return null;
        }
    }

    @Override
    public Author findAuthorByName(String name) {
        Optional<Author> author = Optional.ofNullable(authorRepository.findByName(name));

        if(name.isEmpty() || author.isEmpty()) {
            System.out.println("Nombre inválido o autor no encontrado!");
            return null;
        } else {
            return author.get();
        }
    }

    @Override
    public void saveAuthor(Author author) {
        try {
            em.getTransaction().begin();
            authorRepository.save(author);
            em.getTransaction().commit();

            System.out.println("Autor registrado/actualizado exitosamente!");
        } catch(Exception e) {
            em.getTransaction().rollback();
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteAuthor(Author author) {
        try {
            em.getTransaction().begin();
            authorRepository.delete(author);
            em.getTransaction().commit();

            System.out.println("Autor eliminado exitosamente!");
        } catch(Exception e) {
            em.getTransaction().rollback();
            throw new RuntimeException(e);
        }
    }
}
