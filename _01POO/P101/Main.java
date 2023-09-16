package _01POO.P101;

import _01POO.P101.services.BookService;

public class Main {
    public static void main(String[] args) {
        BookService bookService = new BookService();

        System.out.println(bookService.createBook());
    }
}