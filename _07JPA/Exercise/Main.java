package org.amincia._07JPA.Exercise;

import jakarta.persistence.EntityManager;
import org.amincia._07JPA.Exercise.entity.Author;
import org.amincia._07JPA.Exercise.entity.Book;
import org.amincia._07JPA.Exercise.service.AuthorServiceImpl;
import org.amincia._07JPA.Exercise.service.BookServiceImpl;
import org.amincia._07JPA.Exercise.service.EditorialServiceImpl;
import org.amincia._07JPA.Exercise.util.JPAUtil;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static final EntityManager em = JPAUtil.getEntityManager();
    public static Scanner scanner = new Scanner(System.in).useDelimiter("\r?\n");
    public static AuthorServiceImpl authorService = new AuthorServiceImpl(em);
    public static EditorialServiceImpl editorialService = new EditorialServiceImpl(em);
    public static BookServiceImpl bookService = new BookServiceImpl(em);

    public static void main(String[] args) {
        int opt;

        do {
            System.out.println("\n===================================");
            System.out.println("LIBRERÍA");
            System.out.println("1. Registrar");
            System.out.println("2. Actualizar");
            System.out.println("3. Buscar");
            System.out.println("4. Eliminar");
            System.out.println("0. SALIR");
            System.out.println("===================================");
            System.out.print("OPCIÓN: ");
            opt = scanner.nextInt();

            switch(opt) {
                case 1 -> registerEntities();
                case 2 -> updateEntities();
                case 3 -> searchEntities();
                case 4 -> deleteEntities();
            }
        } while(opt != 0);

        em.close();
    }

    private static void registerEntities() {
        int opt;

        do {
            System.out.println("\n===================================");
            System.out.println("REGISTRAR ENTIDADES");
            listEntities();
            opt = scanner.nextInt();

            switch(opt) {
                case 1 -> {
                    System.out.println("\nREGISTRO DE AUTOR");
                    authorService.saveAuthor(authorService.createAuthor());
                }
                case 2 -> {
                    System.out.println("\nREGISTRO DE EDITORIAL");
                    editorialService.saveEditorial(editorialService.createEditorial());
                }
                case 3 -> {
                    System.out.println("\nREGISTRO DE LIBRO");
                    bookService.saveBook(bookService.createBook());
                }
            }
        } while(opt != 0);
    }

    private static void updateEntities() {
        int opt;

        do {
            System.out.println("\n===================================");
            System.out.println("ACTUALIZAR ENTIDADES");
            listEntities();
            opt = scanner.nextInt();

            switch(opt) {
                case 1 -> {
                    System.out.println("\nACTUALIZAR UN AUTOR");
                    authorService.saveAuthor(authorService.updateAuthor());
                }
                case 2 -> {
                    System.out.println("\nACTUALIZAR UNA EDITORIAL");
                    editorialService.saveEditorial(editorialService.updateEditorial());
                }
                case 3 -> {
                    System.out.println("\nACTUALIZAR UN LIBRO");
                    bookService.saveBook(bookService.updateBook());
                }
            }
        } while(opt != 0);
    }

    private static void searchEntities() {
        int opt;

        do {
            System.out.println("\n===================================");
            System.out.println("BUSCAR ENTIDADES");
            System.out.println("===================================");
            System.out.println("1. Buscar autor por nombre");
            System.out.println("2. Buscar libro por ISBN");
            System.out.println("3. Buscar libro por título");
            System.out.println("4. Buscar libro(s) por nombre de autor");
            System.out.println("5. Buscar libro(s) por nombre de editorial");
            System.out.println("0. REGRESAR");
            System.out.println("===================================");
            System.out.print("OPCIÓN: ");
            opt = scanner.nextInt();

            switch(opt) {
                case 1 -> {
                    System.out.println("\nBUSCAR AUTOR POR NOMBRE");
                    System.out.print("Ingrese el nombre del autor: ");
                    Author author = authorService.findAuthorByName(scanner.next().trim());
                    if(author != null) System.out.println(author);
                }
                case 2 -> {
                    System.out.println("\nBUSCAR LIBRO POR ISBN");
                    System.out.print("Ingrese el ISBN del libro: ");
                    Book book = bookService.findBookById(scanner.next().trim());
                    if(book != null) System.out.println(book);
                }
                case 3 -> {
                    System.out.println("\nBUSCAR LIBRO POR TÍTULO");
                    System.out.print("Ingrese el título del libro: ");
                    Book book = bookService.findBookByTitle(scanner.next().trim());
                    if(book != null) System.out.println(book);
                }
                case 4 -> {
                    System.out.println("\nBUSCAR LIBROS POR AUTOR");
                    System.out.print("Ingrese nombre del autor: ");
                    List<Book> books = bookService.findBooksByAuthorName(scanner.next().trim());
                    for(Book book : books) System.out.println(book);
                }
                case 5 -> {
                    System.out.println("\nBUSCAR LIBROS POR EDITORIAL");
                    System.out.print("Ingrese nombre del autor: ");
                    List<Book> books = bookService.findBooksByEditorialName(scanner.next().trim());
                    for(Book book : books) System.out.println(book);
                }
            }
        } while(opt != 0);
    }

    private static void deleteEntities() {
        int opt;

        do {
            System.out.println("\n===================================");
            System.out.println("ELIMINAR ENTIDADES");
            listEntities();
            opt = scanner.nextInt();

            switch(opt) {
                case 1 -> {
                    System.out.println("\nELIMINAR UN AUTOR");
                    authorService.deleteAuthor(authorService.checkAuthorByID());
                }
                case 2 -> {
                    System.out.println("\nELIMINAR UNA EDITORIAL");
                    editorialService.deleteEditorial(editorialService.checkEditorialByID());
                }
                case 3 -> {
                    System.out.println("\nELIMINAR UN LIBRO");
                    bookService.deleteBook(bookService.checkBookByID());
                }
            }
        } while(opt != 0);
    }

    private static void listEntities() {
        System.out.println("===================================");
        System.out.println("1. Autor");
        System.out.println("2. Editorial");
        System.out.println("3. Libro");
        System.out.println("0. REGRESAR");
        System.out.println("===================================");
        System.out.print("OPCIÓN: ");
    }
}
