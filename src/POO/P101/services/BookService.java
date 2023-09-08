package POO.P101.services;

import POO.P101.entities.Book;

import java.util.Scanner;

public class BookService {
    Scanner scanner = new Scanner(System.in).useDelimiter("\r?\n");

    public Book createBook() {
        Book book = new Book();

        System.out.print("Ingrese el código ISBN: ");
        book.setIsbn(scanner.next());
        System.out.print("Ingrese el título: ");
        book.setTitle(scanner.next());
        System.out.print("Ingrese el autor: ");
        book.setAuthor(scanner.next());
        System.out.print("Ingrese el número de páginas: ");
        book.setPagesNumber(scanner.nextInt());

        return book;
    }
}
