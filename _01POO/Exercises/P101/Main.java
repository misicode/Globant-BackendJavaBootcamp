package com.misicode._01POO.Exercises.P101;

import com.misicode._01POO.Exercises.P101.services.BookService;

public class Main {
    public static void main(String[] args) {
        BookService bookService = new BookService();

        System.out.println(bookService.createBook());
    }
}