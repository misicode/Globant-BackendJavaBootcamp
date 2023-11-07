package com.misicode._07JPA.Exercise.service;

import com.misicode._07JPA.Exercise.entity.Editorial;
import com.misicode._07JPA.Exercise.repository.EditorialCRUDRepository;
import com.misicode._07JPA.Exercise.repository.EditorialCRUDRepositoryImpl;
import jakarta.persistence.EntityManager;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class EditorialServiceImpl implements EditorialService {
    private final EntityManager em;
    private final EditorialCRUDRepository editorialRepository;
    private final Scanner scanner = new Scanner(System.in).useDelimiter("\r?\n");

    public EditorialServiceImpl(EntityManager em) {
        this.em = em;
        this.editorialRepository = new EditorialCRUDRepositoryImpl(em);
    }

    public Editorial createEditorial() {
        Editorial editorial = new Editorial();

        editorial.setName(checkEditorialName());

        return editorial;
    }

    public Editorial updateEditorial() {
        Editorial editorial = checkEditorialByID();

        System.out.println(editorial);

        editorial.setName(checkEditorialName());

        return editorial;
    }

    private String checkEditorialName() {
        do {
            System.out.print("Ingrese el nombre de la editorial: ");
            String name = scanner.nextLine().trim();

            if(name.isEmpty() || Optional.ofNullable(editorialRepository.findByName(name)).isPresent()) {
                System.out.println("Nombre de editorial inválido o ya registrado!");
            } else {
                return name;
            }
        } while(true);
    }

    public Editorial checkEditorialByID() {
        Editorial editorial;

        do {
            System.out.print("Ingrese el ID de la editorial: ");
            editorial = findEditorialById(scanner.nextLine().trim());
        } while(editorial == null);

        return editorial;
    }

    public Editorial checkEditorialByName() {
        Editorial editorial;

        do {
            System.out.print("Ingrese el nombre de la editorial: ");
            editorial = findEditorialByName(scanner.nextLine().trim());
        } while(editorial == null);

        return editorial;
    }

    @Override
    public List<Editorial> findAllEditorials() {
        return editorialRepository.findAll();
    }

    @Override
    public Editorial findEditorialById(String id) {
        try {
            Optional<Editorial> editorial = Optional.ofNullable(editorialRepository.findById(Integer.parseInt(id)));
            if(editorial.isEmpty()) {
                System.out.println("Editorial no encontrada!");
                return null;
            } else {
                return editorial.get();
            }
        } catch(Exception e) {
            System.out.println("ID inválido!");
            return null;
        }
    }

    @Override
    public Editorial findEditorialByName(String name) {
        Optional<Editorial> editorial = Optional.ofNullable(editorialRepository.findByName(name));

        if(name.isEmpty() || editorial.isEmpty()) {
            System.out.println("Nombre inválido o editorial no encontrada!");
            return null;
        } else {
            return editorial.get();
        }
    }

    @Override
    public void saveEditorial(Editorial editorial) {
        try {
            em.getTransaction().begin();
            editorialRepository.save(editorial);
            em.getTransaction().commit();

            System.out.println("Editorial registrada/actualizada exitosamente!");
        } catch(Exception e) {
            em.getTransaction().rollback();
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteEditorial(Editorial editorial) {
        try {
            em.getTransaction().begin();
            editorialRepository.delete(editorial);
            em.getTransaction().commit();

            System.out.println("Editorial eliminada exitosamente!");
        } catch(Exception e) {
            em.getTransaction().rollback();
            throw new RuntimeException(e);
        }
    }
}
