package org.amincia._07JPA.Exercise.service;

import jakarta.persistence.EntityManager;
import org.amincia._07JPA.Exercise.entity.Book;
import org.amincia._07JPA.Exercise.repository.BookCRUDRepository;
import org.amincia._07JPA.Exercise.repository.BookCRUDRepositoryImpl;
import org.amincia._07JPA.Exercise.util.JPAUtil;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class BookServiceImpl implements BookService {
    private final EntityManager em;
    private final BookCRUDRepository bookRepository;
    private final AuthorServiceImpl authorService = new AuthorServiceImpl(JPAUtil.getEntityManager());
    private final EditorialServiceImpl editorialService = new EditorialServiceImpl(JPAUtil.getEntityManager());
    private final Scanner scanner = new Scanner(System.in).useDelimiter("\r?\n");

    public BookServiceImpl(EntityManager em) {
        this.em = em;
        this.bookRepository = new BookCRUDRepositoryImpl(em);
    }

    public Book createBook() {
        Book book = new Book();

        book.setIsbn(checkBookIsbn());
        book.setTitle(checkBookTitle());
        book.setYear(checkIntegerValue("Ingrese el año: "));
        book.setExemplars(checkIntegerValue("Ingrese el número de ejemplares: "));
        book.setBorrowedExemplars(checkIntegerValue("Ingrese el número de ejemplares prestados: "));
        book.setRemainingExemplars(book.getExemplars() - book.getBorrowedExemplars());
        book.setAuthor(authorService.checkAuthorByName());
        book.setEditorial(editorialService.checkEditorialByName());

        return book;
    }

    public Book updateBook() {
        Book book = checkBookByID();
        int opt;

        do {
            System.out.println();
            System.out.println(book);
            System.out.println("1. Título");
            System.out.println("2. Año");
            System.out.println("3. Número de ejemplares");
            System.out.println("4. Número de ejemplares prestados");
            System.out.println("5. Autor");
            System.out.println("6. Editorial");
            System.out.println("0. GUARDAR CAMBIOS");
            System.out.print("Elija el número del campo a modificar: ");
            opt = scanner.nextInt();

            switch(opt) {
                case 1 -> book.setTitle(checkBookTitle());
                case 2 -> book.setYear(checkIntegerValue("Ingrese el año: "));
                case 3 -> {
                    book.setExemplars(checkIntegerValue("Ingrese el número de ejemplares: "));
                    book.setRemainingExemplars(book.getExemplars() - book.getBorrowedExemplars());
                }
                case 4 -> {
                    book.setBorrowedExemplars(checkIntegerValue("Ingrese el número de ejemplares prestados: "));
                    book.setRemainingExemplars(book.getExemplars() - book.getBorrowedExemplars());
                }
                case 5 -> book.setAuthor(authorService.checkAuthorByName());
                case 6 -> book.setEditorial(editorialService.checkEditorialByName());
            }
        } while(opt != 0);

        return book;
    }

    private String checkBookIsbn() {
        do {
            System.out.print("Ingrese el ISBN: ");
            String isbn = scanner.next().trim();

            if(isbn.length() != 13 || Optional.ofNullable(bookRepository.findById(isbn)).isPresent()) {
                System.out.println("ISBN inválido o ya registrado!");
            } else {
                return isbn;
            }
        } while(true);
    }

    private String checkBookTitle() {
        do {
            System.out.print("Ingrese el título: ");
            String title = scanner.next().trim();

            if(title.isEmpty() || Optional.ofNullable(bookRepository.findByTitle(title)).isPresent()) {
                System.out.println("Título inválido o ya registrado!");
            } else {
                return title;
            }
        } while(true);
    }

    private int checkIntegerValue(String message) {
        do {
            System.out.print(message);
            String value = scanner.next().trim();

            try {
                return Integer.parseInt(value);
            } catch(Exception e) {
                System.out.println("Valor inválido!");
            }
        } while(true);
    }

    public Book checkBookByID() {
        Book book;

        do {
            System.out.print("Ingrese el ISBN del libro: ");
            book = findBookById(scanner.nextLine().trim());
        } while(book == null);

        return book;
    }

    @Override
    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book findBookById(String isbn) {
        Optional<Book> book = Optional.ofNullable(bookRepository.findById(isbn));

        if(book.isEmpty()) {
            System.out.println("Libro no encontrado!");
            return null;
        } else {
            return book.get();
        }
    }

    @Override
    public Book findBookByTitle(String title) {
        Optional<Book> book = Optional.ofNullable(bookRepository.findByTitle(title));

        if(title.isEmpty() || book.isEmpty()) {
            System.out.println("Título inválido o libro no encontrado!");
            return null;
        } else {
            return book.get();
        }
    }

    @Override
    public List<Book> findBooksByAuthorName(String name) {
        List<Book> books = bookRepository.findByAuthorName(name);

        if(books.isEmpty()) System.out.println("No se encontraron libros con ese autor!");

        return books;
    }

    @Override
    public List<Book> findBooksByEditorialName(String name) {
        List<Book> books = bookRepository.findByEditorialName(name);

        if(books.isEmpty()) System.out.println("No se encontraron libros con esa editorial!");

        return books;
    }

    @Override
    public void saveBook(Book book) {
        try {
            em.getTransaction().begin();
            bookRepository.save(book);
            em.getTransaction().commit();

            System.out.println("Libro registrado/actualizado exitosamente!");
        } catch(Exception e) {
            em.getTransaction().rollback();
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteBook(Book book) {
        try {
            em.getTransaction().begin();
            bookRepository.delete(book);
            em.getTransaction().commit();

            System.out.println("Libro eliminado exitosamente!");
        } catch(Exception e) {
            em.getTransaction().rollback();
            throw new RuntimeException(e);
        }
    }
}
